package Bank;

import java.util.HashMap;

public final class Customer {
    private String id;
    private String name;
    private HashMap<Bank, Account> accounts;

    public Customer(String id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.accounts = new HashMap<Bank, Account>();
    }
}
