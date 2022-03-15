package Exercicios.Exercicio3;

import Exercicios.Exercicio3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.primeiroTrimestre = sc.nextDouble();
        student.segundoTrimestre = sc.nextDouble();
        student.terceiroTrimestre = sc.nextDouble();

        System.out.println(student.Aproved());


        sc.close();

    }
}
