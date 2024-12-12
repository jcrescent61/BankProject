package Bank;

public enum BankMenu {
    RESIST_CUSTOMER,
    RESIST_ACCOUNT,
    DEPOSIT,
    WITHDRAW,
    INQUIRY_BALANCE,
    EXIT;

    public int asIndex() {
        int index = 0;

        switch (this) {
            case RESIST_CUSTOMER -> index = 1;
            case RESIST_ACCOUNT -> index = 2;
            case DEPOSIT -> index = 3;
            case WITHDRAW -> index = 4;
            case INQUIRY_BALANCE -> index = 5;
            case EXIT -> index = 6;
        }

        return index;
    }

    public String asMenuText() {
        String text = "";

        switch (this) {
            case RESIST_CUSTOMER -> text = "1. 고객 등록";
            case RESIST_ACCOUNT -> text = "2. 계좌 생성";
            case DEPOSIT -> text = "3. 입금";
            case WITHDRAW -> text = "4. 출금";
            case INQUIRY_BALANCE -> text = "5. 잔액 조회";
            case EXIT -> text = "6. 종료";
        }

        return text;
    }
}
