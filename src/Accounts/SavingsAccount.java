package Accounts;

public class SavingsAccount extends Account implements MoneyTarget {
    protected long minBalance;

    public SavingsAccount(String name, long minBalance, int i) {
        super(name, i);
        this.minBalance = minBalance;
    }

    public boolean pay(long amount, long minBalance) {
        if (balance - amount < minBalance) {
            return false;
        }
        return super.pay(amount);
    }


    @Override
    public boolean accept(int money) {
        return false;
    }
}
