package Bank;

import java.util.Arrays;
import java.util.Scanner;

public final class Main {
    private static final Main main = new Main(Bank.KOOKMIN.asBank());

    private Scanner scanner = new Scanner(System.in);
    private Bankable bank;

    public Main(Bankable bank) {
        this.bank = bank;
        startProgram();
    }

    public static void main(String[] args) {}

    private void startProgram() {
        while (true) {
            System.out.println("=== " + bank.getBankName() + " 시스템 ===");

            for (BankMenu menu: Arrays.asList(BankMenu.values())) {
                System.out.println(menu.asMenuText());
            }

            System.out.print("입력해 주세요: ");
            int index = (scanner.nextInt());
            BankMenu selectedMenu = BankMenu.values()[index - 1];

            switch (selectedMenu) {
                case RESIST_CUSTOMER:
                    resistCustomer();
                case RESIST_ACCOUNT:

                case DEPOSIT:

                case WITHDRAW:

                case INQUIRY_BALANCE:

                case EXIT:
                    System.out.println("종료 되었습니다.");
                    break;
            }
        }
    }

    private void resistCustomer() {
        System.out.println("=== 고객 등록 페이지 입니다. ===");

        System.out.print("원하시는 아이디를 입력해주세요: ");
        String customerId = scanner.next();
        System.out.println();
        String name = scanner.next();

        bank.registCustomer(name, customerId);
    }
}
