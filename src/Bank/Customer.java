package Bank;

import java.util.HashMap;

public final class Customer {
    private String id;
    private String name;
    private HashMap<Bank, Account> accounts = new HashMap<>();

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void receiveAccount(Bank bank, Account account) {
        accounts.put(bank, account);
    }
}
