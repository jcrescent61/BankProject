package Bank;

public class HanaBank implements Bankable {
    private static String name = "하나 은행";

    @Override
    public String getBankName() {
        return name;
    }

    @Override
    public void registCustomer() {
        System.out.println("=== 고객 등록 페이지 입니다. ===");
        System.out.println("=== 은행 문 안 열었어요. ===");
    }

    @Override
    public void registAccount() {
        System.out.println("=== 계좌 생성 페이지 입니다. ===");
        System.out.println("=== 은행 문 안 열었어요. ===");
    }

    @Override
    public void deposit() {
        System.out.println("=== 입금 페이지 입니다. ===");
        System.out.println("=== 은행 문 안 열었어요. ===");
    }

    @Override
    public void withdraw() {
        System.out.println("=== 출금 페이지 입니다. ===");
        System.out.println("=== 은행 문 안 열었어요. ===");
    }

    @Override
    public void inquiryBalance() {
        System.out.println("=== 잔액 조회 페이지 입니다. ===");
        System.out.println("=== 은행 문 안 열었어요. ===");
    }
}
