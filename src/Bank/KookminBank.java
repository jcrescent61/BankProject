package Bank;

import java.util.HashMap;
import java.util.Scanner;

public class KookminBank implements Bankable {
    private static Bank bank = Bank.KOOKMIN;
    private Scanner scanner = new Scanner(System.in);

    private AccountNumberGenerator accountNumberGenerator = new AccountNumberGenerator();

    private HashMap<String, Customer> customerDataBase = new HashMap<>();
    private HashMap<String, String> accountNumbersDataBase = new HashMap<>();

    @Override
    public String getBankName() {
        return bank.asName();
    }

    @Override
    public void registCustomer() {
        System.out.println("=== 고객 등록 페이지 입니다. ===");
        System.out.print("성함을 알려주세요.: ");
        String name = scanner.next();

        System.out.print("원하시는 아이디를 입력해주세요: ");
        String customerId = scanner.next();

        if (customerDataBase.containsKey(customerId)) {
            System.out.println("=== 이미 존재하는 아이디 입니다. ===");
        } else {
            customerDataBase.put(
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

        if (accountNumbersDataBase.containsValue(customerId)) {
            System.out.println("=== 이미 계좌가 존재합니다. ===");
        } else {
            Customer customer = customerDataBase.get(customerId);
            String accountNumber = accountNumberGenerator.generateAccountNumber(accountNumbersDataBase);

            KookminBankAccount account = new KookminBankAccount(
                    customerId,
                    accountNumber
            );

            accountNumbersDataBase.put(accountNumber, customerId);

            customer.receiveAccount(
                    bank,
                    account
            );

            System.out.println("=== 계좌가 생성 되었습니다. ===");
            System.out.println("고객명: " + customer.getName());
            System.out.println("고객 아이디: " + customer.getId());
            System.out.println("계좌 번호: " + accountNumber);
            System.out.println("=== 이용해 주셔서 감사합니다. ===");
        }
    }

    @Override
    public void deposit() {
        System.out.println("=== 입금 페이지 입니다. ===");
        System.out.print("계좌 번호를 알려주세요.: ");
        String accountNumber = scanner.next();

        if (accountNumbersDataBase.containsKey(accountNumber)) {
            Customer currentCustomer = customerDataBase.get(accountNumbersDataBase.get(accountNumber));
            Account tempAccount = currentCustomer.getAccount(bank);

            System.out.println("현재 잔액: " + currentCustomer.getAccount(bank).inquiryBalance());
            System.out.print("입금 금액을 입력해 주세요.: ");

            int depositMoney = scanner.nextInt();

            tempAccount.deposit(depositMoney);
            currentCustomer.receiveAccount(bank, tempAccount);

            System.out.println("=== " + depositMoney + "원이 입금 되었습니다. ===");
            System.out.println(
                    "잔액: " + currentCustomer.getAccount(bank).inquiryBalance());
        } else {
            System.out.println("=== 존재하지 않는 계좌 번호 입니다. ===");
        }
    }

    @Override
    public void withdraw() {

    }

    @Override
    public void inquiryBalance() {

    }

    @Override
    public void inquiryCustomer() {

    }
}