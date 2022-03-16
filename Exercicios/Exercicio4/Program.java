package Exercicios.Exercicio4;

import Exercicios.Exercicio4.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char question = sc.next().charAt(0);

        Account account = new Account(accountNumber,name);

        if(question == 'y'){
            System.out.printf("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
            account.addMoney(initialValue);
            System.out.println("Account date:");
            System.out.println(account);
        }else {
            System.out.println("Account date:");
            System.out.println(account);
        }

        System.out.print("Enter a deposit value: ");
        double valueDeposit = sc.nextDouble();
        account.addMoney(valueDeposit);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdrawMoney(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);



        sc.close();
    }
}
