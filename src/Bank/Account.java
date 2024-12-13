package Bank;

public abstract class Account {
    private Bank bank;
    private String customerId;
    private String accountNumber;
    private int balance = 0;

    public int inquiryBalance() {
        return balance;
    }
    public void deposit(int depositMoney) {
        balance += depositMoney;
    }
    public void withdrawal(int withdrawalMoney) {
        balance -= withdrawalMoney;
    }
}
