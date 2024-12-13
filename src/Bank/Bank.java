package Bank;

public enum Bank {
    KOOKMIN(new KookminBank(), "국민 은행"),
    HANA(new HanaBank(), "하나 은행");

    private final Bankable bank;
    private final String name;

    Bank(Bankable bank, String name) {
        this.bank = bank;
        this.name = name;
    }

    public Bankable asBank() {
        return bank;
    }

    public String asName() {
        return name;
    }
}