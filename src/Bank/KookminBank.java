package Bank;

public class KookminBank implements Bankable {
    private static String bankName = "국민 은행";

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public void registCustomer(String customerId) {

    }

    @Override
    public void inquiryCustomer(String customerId) {

    }
}
