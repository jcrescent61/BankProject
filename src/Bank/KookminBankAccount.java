package Bank;

public class KookminBankAccount extends Account {
    static final String bankName = "국민은행";

    public KookminBankAccount(
            String customerId,
            int accountNumber,
            int money
            ) {
        customerId = customerId;
        accountNumber = accountNumber;
        money = money;
    }
}
