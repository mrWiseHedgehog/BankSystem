import Accounts.CheckingAccount;
import Accounts.Client;
import Accounts.CreditAccount;
import Accounts.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Leo", 10);
        CheckingAccount checkingAccount = new CheckingAccount("Leo", 1000);
        CreditAccount creditAccount = new CreditAccount("Leo", 500);
        SavingsAccount savingsAccount = new SavingsAccount("Leo", 0, 750);


        System.out.println("Оплата с расчетного счета: " + checkingAccount.pay(100));
        System.out.println("Пополнение расчетного счета: " + checkingAccount.add(750));
        System.out.println("Оплата с кредитного счета: " + creditAccount.pay(100));
        System.out.println("Пополнение кредитного счета: " + creditAccount.add(750));
        System.out.println("Оплата со сберегательного счета: " + savingsAccount.pay(100));
        System.out.println("Пополнение со сберегательного счета: " + savingsAccount.add(750));
        System.out.println("*************************");
        System.out.println("MoneyTargetCheck: " + creditAccount.accept(48753));
        System.out.println("*************************");
    }
}