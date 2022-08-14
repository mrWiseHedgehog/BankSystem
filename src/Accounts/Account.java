package Accounts;

public abstract class Account implements MoneyTarget {
    protected String name;
    protected long balance;
    protected long amount;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean pay(long amount) {
        balance -= amount;
        return true;
    }

    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    public boolean transfer(Account accountTo, long amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else {
            return false;
        }
    }

}
