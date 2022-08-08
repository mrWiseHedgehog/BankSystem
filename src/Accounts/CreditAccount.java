package Accounts;

public class CreditAccount extends Account implements MoneyTarget {
    public CreditAccount(String name, int i) {
        super(name, i);
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            return false;
        }
        return super.add(amount);
    }

    @Override
    public boolean accept(int money) {
        return false;
    }

    //public boolean pay(long amount, long minBalance) {return false;}
}
