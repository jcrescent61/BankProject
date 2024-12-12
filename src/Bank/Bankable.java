package Bank;

public interface Bankable {
    public String getBankName();
    public void registCustomer(String customerId);
    public void inquiryCustomer(String customerId);
}
