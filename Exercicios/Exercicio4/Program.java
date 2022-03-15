package Exercicios.Exercicio4;

import Exercicios.Exercicio4.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter account number: ");
        int acountNumber = sc.nextInt();

        sc.nextLine();

        System.out.printf("Enter account holder: ");
        String name = sc.nextLine();

        System.out.printf("Is there na initial deposit (y/n)? ");
        Character question = sc.next().charAt(0);

        Account acount = new Account(acountNumber,name);

        if(question == 'y'){
            System.out.printf("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
            acount.addMoney(initialValue);
            System.out.println("Account date:");
            System.out.println(acount);
        }else {
            System.out.println("Account date:");
            System.out.println(acount);
        }




        sc.close();
    }
}
