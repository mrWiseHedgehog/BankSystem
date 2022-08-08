package Accounts;

public class CheckingAccount extends Account implements MoneyTarget {
    public CheckingAccount(String name, int i) {
        super(name, i);
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount < 0) {
            return false;
        }
        return super.pay(amount);
    }

    @Override
    public boolean accept(int money) {
        return false;
    }

    //public boolean pay(long amount, long minBalance) {return false;}
}
