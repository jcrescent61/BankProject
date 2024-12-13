package Bank;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class KookminBank implements Bankable {
    private static Bank bank = Bank.KOOKMIN;
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Customer> customers = new HashMap<>();
    private HashMap<String, String> accountNumbers = new HashMap<>();

    @Override
    public String getBankName() {
        return "국민 은행";
    }

    @Override
    public void registCustomer() {
        System.out.println("=== 고객 등록 페이지 입니다. ===");
        System.out.print("성함을 알려주세요.: ");
        String name = scanner.next();

        System.out.print("원하시는 아이디를 입력해주세요: ");
        String customerId = scanner.next();

        if (customers.containsKey(customerId)) {
            System.out.println("=== 이미 존재하는 아이디 입니다. ===");
        } else {
            customers.put(
                    customerId,
                    new Customer(customerId, name)
            );
            System.out.println("=== 고객 정보가 등록 되었습니다. ===");
        }
    }

    @Override
    public void registAccount() {
        System.out.println("=== 계좌 생성 페이지 입니다. ===");
        System.out.print("아이디를 알려주세요.: ");
        String customerId = scanner.next();

        if (accountNumbers.containsValue(customerId)) {
            System.out.println("=== 이미 계좌가 존재합니다. ===");
        } else {
            Customer customer = customers.get(customerId);
            KookminBankAccount account = new KookminBankAccount(
                    customerId,
                    generateAccountNumber(customerId)
            );

            customer.receiveAccount(
                    bank,
                    account
            );

            System.out.println("=== 계좌가 생성 되었습니다. ===");
        }
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void inquiryBalance() {

    }

    @Override
    public void inquiryCustomer() {}

    public String generateAccountNumber(String customerId) {
        String accountNumber;

        do {
            accountNumber = createRandomAccountNumber();
        } while (accountNumbers.containsKey(accountNumber)); // 중복 확인

        accountNumbers.put(accountNumber, customerId); // 고유 계좌번호 저장
        return accountNumber;
    }

    private String createRandomAccountNumber() {
        Random random = new Random();

        int firstPart = random.nextInt(900) + 100;
        int secondPart = random.nextInt(90) + 10;
        int thirdPart = random.nextInt(900000) + 100000;

        return String.format("%03d-%02d-%06d", firstPart, secondPart, thirdPart);
    }
}
