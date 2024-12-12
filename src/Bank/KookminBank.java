package Bank;

import java.util.HashMap;

public class KookminBank implements Bankable {
    private static String bankName = "국민 은행";
    private HashMap<String, Customer> customers;

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public void registCustomer(String customerId, String name) {
        customers.put(
                customerId,
                new Customer(customerId, name, null)
        );
    }

    @Override
    public void inquiryCustomer(String customerId) {
    }
}
