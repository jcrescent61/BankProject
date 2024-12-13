package Bank;

public interface Bankable {
    public String getBankName();
    public void registCustomer();
    public void registAccount();
    public void deposit();
    public void withdraw();
    public void inquiryBalance();
}
