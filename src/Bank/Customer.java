package Bank;

public final class Customer {
    int id;
    String name;
    KookminBankAccount[] accounts;

    public Customer(int id, String name, KookminBankAccount[] accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }
}
