package Bank;

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

            for (BankMenu menu: BankMenu.values()) {
                System.out.println(menu.asMenuText());
            }

            System.out.print("입력해 주세요: ");
            int index = (scanner.nextInt());
            BankMenu selectedMenu = BankMenu.values()[index - 1];
            detectMenu(selectedMenu);
        }
    }

    private void detectMenu(BankMenu menu) {
        switch (menu) {
            case RESIST_CUSTOMER:
                bank.registCustomer();
                break;
            case RESIST_ACCOUNT:
                bank.registAccount();
                break;
            case DEPOSIT:
                bank.deposit();
                break;
            case WITHDRAW:
                bank.withdraw();
                break;
            case INQUIRY_BALANCE:
                bank.inquiryBalance();
                break;
            case EXIT:
                System.out.println("종료 되었습니다.");
                System.exit(0);
                break;
        }
    }
}
