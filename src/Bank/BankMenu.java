package Bank;

public enum BankMenu {
    RESIST_CUSTOMER("1. 고객 등록"),
    RESIST_ACCOUNT("2. 계좌 생성"),
    DEPOSIT("3. 입금"),
    WITHDRAW("4. 출금"),
    INQUIRY_BALANCE("5. 잔액 조회"),
    EXIT("6. 종료");

    private final String menuText;

    BankMenu(String menuText) {
        this.menuText = menuText;
    }

    public String asMenuText() { return menuText; }
}