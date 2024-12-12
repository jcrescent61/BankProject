package Bank;

public interface Bankable {
    public String getBankName();
    public void registCustomer(String customerId, String name);
    public void inquiryCustomer(String customerId);
}
