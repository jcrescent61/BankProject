package Bank;

public enum BankMenu {
    RESIST_CUSTOMER(1, "1. 고객 등록"),
    RESIST_ACCOUNT(2, "2. 계좌 생성"),
    DEPOSIT(3, "3. 입금"),
    WITHDRAW(4, "4. 출금"),
    INQUIRY_BALANCE(5, "5. 잔액 조회"),
    EXIT(6, "6. 종료");

    private final int index;
    private final String menuText;

    BankMenu(int index, String menuText) {
        this.index = index;
        this.menuText = menuText;
    }

    public int asIndex() {
        return index;
    }

    public String asMenuText() {
        return menuText;
    }
}