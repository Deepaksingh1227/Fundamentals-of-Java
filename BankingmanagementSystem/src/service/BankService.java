package service;

import domain.Account;
import domain.Transaction;

import java.util.ArrayList;

public interface BankService {
    String openAccount(String name, String email, String accountType  );
    ArrayList<Account>listAccounts();

    void deposit(String accountNumber, Double amount, String note);

    void withdraw(String accountNumber, Double amount, String s);

    void transfer(String from, String to, Double amount, String s);

    ArrayList<Transaction> getStatement(String account);

    ArrayList<Account>searchAccountsByCustomerName(String q);
}
