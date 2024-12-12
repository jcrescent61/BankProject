package Bank;

public enum Bank {
    KOOKMIN,
    HANA;

    public Bankable asBank() {
        Bankable bank = null;

        switch (this) {
            case KOOKMIN -> bank = new KookminBank();
            case HANA -> bank = new KookminBank();
        }

        return bank;
    }
}
