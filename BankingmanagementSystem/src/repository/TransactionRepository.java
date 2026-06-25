package repository;
import java.util.*;

import domain.Transaction;

public class TransactionRepository {
    private final HashMap<String, ArrayList<Transaction>>txByAccount= new HashMap<>();



    public void add(Transaction transaction){
        ArrayList<Transaction>list=txByAccount.computeIfAbsent(transaction.getAccountNumber(),
                k-> new ArrayList<>());
        list.add(transaction);
    }
}

