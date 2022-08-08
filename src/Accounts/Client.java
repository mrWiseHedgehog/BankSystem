package Accounts;

public class Client implements MoneyTarget {

    protected String name;
    public static Account[] accounts;

    public Client(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Превышено макимальное число аккаунтов");
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].accept(money)) ;
            return true;
        }
        return false;
    }
}