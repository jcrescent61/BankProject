package Bank;

public abstract class Account {
    private Bank bank;
    private String customerId;
    private String accountNumber;
    private int balance;

    public int inquiryBalance() {
        return balance;
    }
    public void deposit(int balance) {
        balance += balance;
    }
    public void withdrawal(int balance) {
        balance -= balance;
    }
}
