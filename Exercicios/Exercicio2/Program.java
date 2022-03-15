package Exercicios.Exercicio2;

import Exercicios.Exercicio2.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee();
    System.out.printf("Name: ");
    employee.name = sc.nextLine();
    System.out.printf("Gross salary: ");
    employee.grossSalary = sc.nextDouble();
    System.out.printf("Tax: ");
    employee.tax = sc.nextDouble();

    System.out.println(employee);

    System.out.printf("Wich percentage to increase salary ");
    double percentage = sc.nextDouble();
    employee.IncreaseSalary(percentage);

    System.out.println("Update data: " + employee);




    sc.close();

    }
}
