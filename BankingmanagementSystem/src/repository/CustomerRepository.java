package repository;

import domain.Customer;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomerRepository {
    private final HashMap<String , Customer> customersById= new HashMap<>();

    public ArrayList<Customer> findAll() {
        return new ArrayList<>(customersById.values());


    }
}
