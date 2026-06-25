package service;

import domain.Account;

import java.util.ArrayList;

public interface BankService {
    String openAccount(String name, String email, String accountType  );
    ArrayList<Account>listAccounts();
    void deposit(String accountNumber, Double amount, String note);
}
