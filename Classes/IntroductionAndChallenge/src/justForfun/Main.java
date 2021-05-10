package justForfun;

import justForfun.Account;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();
//        Account a = new Account(31000,"Safron", "31",2482394832312L);

        System.out.println("Hi " +a.getName()+" "+ a.deposit(29000));
        System.out.println(a.withdraw(21000));
    }
}
