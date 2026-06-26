package repository;
import java.util.*;
import domain.Account;
import domain.Customer;

public class AccountRepository {
    private final HashMap<String , Account>accountByNumber= new HashMap<>();
    public void save(Account account){
        accountByNumber.put(account.getAccountNumber(), account);
    }
    public ArrayList<Account>findAll(){
        return new ArrayList<>(accountByNumber.values());
    }

    public Optional<Account> findBYNumber(String accountNumber) {
        return Optional.ofNullable(accountByNumber.get(accountNumber));

    }

    public ArrayList<Account> findByCustomerId(String customerId) {
        ArrayList<Account>result= new ArrayList<>();
        for(Account a : accountByNumber.values()){
            if(a.getCustomerId().equals(customerId)){
                result.add(a);
            }

        }

        return result;

    }
}
