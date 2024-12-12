package Bank;

public abstract class Account {
    private String bankName = "";
    private String customerId = "";
    private int accountNumber = 0;
    private int balance = 0;

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
