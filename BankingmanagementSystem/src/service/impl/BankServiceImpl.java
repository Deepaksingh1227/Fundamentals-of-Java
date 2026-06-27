package service.impl;
import domain.Account;
import domain.Customer;



import domain.Transaction;
import domain.Type;
import repository.AccountRepository;
import repository.CustomerRepository;
import repository.TransactionRepository;
import service.BankService;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankServiceImpl implements BankService {


    private String getAccountNumber(){
        int  size= accountRepository.findAll().size()+1;
        return String.format("AC%06d",size);


    }


    private final AccountRepository accountRepository= new AccountRepository();
    private final TransactionRepository transactionRepository= new TransactionRepository();
    private final CustomerRepository customerRepository= new CustomerRepository();
    @Override
    public String openAccount( String name, String email, String accountType) {
        String customerId= UUID.randomUUID().toString();


        //create customers
        //String customerId= UUID.randomUUID().toString();
        Customer c= new Customer( customerId,name, email);
        customerRepository.save(c);


        //change later -->10+1= AC11
       // String accountNumber= UUID.randomUUID().toString();


        String accountNumber= getAccountNumber();

        Account account= new Account(accountNumber, customerId, (double) 0, accountType);

        // Save
        accountRepository.save(account);


        return accountNumber;
    }

    @Override
    public ArrayList<Account> listAccounts() {
        return (ArrayList<Account>) accountRepository.findAll().stream()
                .sorted(Comparator.comparing(Account::getAccountNumber))
                .collect(Collectors.toList());
    }

    @Override
    public void deposit(String accountNumber, Double amount, String note) {
        Account account = accountRepository.findBYNumber(accountNumber)
                .orElseThrow(()->new RuntimeException("Account not found: "+ accountNumber));
        account.setBalance(account.getBalance()+amount);

        Transaction transaction = new Transaction(
                UUID.randomUUID().toString(),      // id
                account.getAccountNumber(),        // accountNumber
                Type.DEPOSIT,                      // type
                amount,                            // amount
                LocalDateTime.now(),               // timestamp
                note                               // note
        );
        transactionRepository.add(transaction);
    }

    @Override
    public void withdraw(String accountNumber, Double amount, String note) {
        Account account = accountRepository.findBYNumber(accountNumber)
                .orElseThrow(()->new RuntimeException("Account not found: "+ accountNumber));
        if(account.getBalance().compareTo(amount)<0) {
            throw new RuntimeException("Insufficient Balance");
        }
        account.setBalance(account.getBalance()-amount);

        Transaction transaction = new Transaction(
                UUID.randomUUID().toString(),      // id
                account.getAccountNumber(),        // accountNumber
                Type.WITHDRAW,                      // type
                amount,                            // amount
                LocalDateTime.now(),               // timestamp
                note
                // note
        );
        transactionRepository.add(transaction);
    }

    @Override
    public void transfer(String fromAcc, String toAcc, Double amount, String note) {
        if(fromAcc.equals(toAcc)){
            throw new RuntimeException("Cannot transfer to your own account");
        }
        Account from = accountRepository.findBYNumber(fromAcc)
                .orElseThrow(()->new RuntimeException("Account not found: "+ fromAcc));
        Account to = accountRepository.findBYNumber(toAcc)
                .orElseThrow(()->new RuntimeException("Account not found: "+ toAcc));
        if(from.getBalance().compareTo(amount)<0) {
            throw new RuntimeException("Insufficient Balance");
        }
        from.setBalance(from.getBalance()-amount);
        to.setBalance(to.getBalance()+amount);

        Transaction fromTransaction = new Transaction(
                UUID.randomUUID().toString(),      // id
                from.getAccountNumber(),        // accountNumber
                Type.TRANSFER_OUT,                      // type
                amount,                            // amount
                LocalDateTime.now(),               // timestamp
                note
                // note
        );
        transactionRepository.add(fromTransaction);

        Transaction toTransaction = new Transaction(
                UUID.randomUUID().toString(),      // id
                from.getAccountNumber(),        // accountNumber
                Type.TRANSFER_IN,                      // type
                amount,                            // amount
                LocalDateTime.now(),               // timestamp
                note
                // note
        );
        transactionRepository.add(toTransaction);

    }

    @Override
    public ArrayList<Transaction> getStatement(String account) {
        return (ArrayList<Transaction>) transactionRepository.findByAccount(account).stream()
                .sorted(Comparator.comparing(Transaction::getTimestamp))
                .collect(Collectors.toList());
    }

    @Override
    public ArrayList<Account> searchAccountsByCustomerName(String q) {
        String query = (q==null)?"": q.toLowerCase();
//        ArrayList<Account>result= new ArrayList<>();
//        for(Customer c : customerRepository.findAll()){
//            if(c.getName().toLowerCase().contains(query)){
//                result.addAll(accountRepository.findByCustomerId(c.getId()));
//            }
//
//        }
//        result.sort(Comparator.comparing(Account::getAccountNumber));
        return (ArrayList<Account>) customerRepository.findAll().stream()
                .filter(c->c.getName().toLowerCase().contains(query))
                .flatMap(c->accountRepository.findByCustomerId(c.getId()).stream())
                .sorted(Comparator.comparing(Account:: getAccountNumber))
                .collect(Collectors.toList());
        //return result;
    }


}
