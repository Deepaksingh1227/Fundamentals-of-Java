package service.impl;
import domain.Account;
import domain.Transaction;
import domain.Type;
import repository.AccountRepository;
import repository.TransactionRepository;
import service.BankService;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankServiceImpl implements BankService {


    private String getAccountNumber(){
        int  size= accountRepository.findAll().size()+1;
        return String.format("AC%06d",size);


    }


    private final AccountRepository accountRepository= new AccountRepository();
    private final TransactionRepository transactionRepository= new TransactionRepository();
    @Override
    public String openAccount( String name, String email, String accountType) {
        String customerId= UUID.randomUUID().toString();

        //change later -->10+1= AC11
       // String accountNumber= UUID.randomUUID().toString();


        String accountNumber= getAccountNumber();

        Account account= new Account(accountNumber, accountType, (double) 0, customerId);

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



}
