package Bank;

public enum Bank {
    KOOKMIN,
    HANA;

    public Bankable asBank() {
        Bankable tempBankable = null;

        switch (this) {
            case KOOKMIN:
                tempBankable = new KookminBank();
                break;
            case HANA:
                tempBankable = new HanaBank();
                break;
        }
        return tempBankable;
    }

    public String asName() {
        String tempName = "";

        switch (this) {
            case KOOKMIN:
                tempName = "국민 은행";
                break;
            case HANA:
                tempName = "하나 은행";
                break;
        }
        return tempName;
    }
}