package Exercicios.Exercicio1;

import Exercicios.Exercicio1.entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle retangle = new Retangle();

        System.out.println("Enter rectangle width and Height: ");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.println(retangle);

        sc.close();
    }
}
