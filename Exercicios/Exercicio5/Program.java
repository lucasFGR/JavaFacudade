package Exercicios.Exercicio5;

import Exercicios.Exercicio5.Entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Aluguel[] vecRom = new Aluguel[10];


        System.out.print("Quantos quartos serão alugados ? ");
        int qtdQuartos = sc.nextInt();

        for(int i = 0; i  < qtdQuartos;i++){
            sc.nextLine();
            System.out.println("Aluguel #" + vecRom.length);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();
            vecRom[numeroQuarto] = new Aluguel(name,email,numeroQuarto);
        }

        System.out.println("Quartos alugados: ");
        for (int i = 0; i < vecRom.length; i++){
            if(vecRom[i] != null){
                System.out.println(i + ": " + vecRom[i].getName() + ","+ vecRom[i].getEmail());
            }
        }


        sc.close();
    }
}
