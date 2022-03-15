package Exercicios.Exercicio2.entities;

public class Employee {
    public String name;
    public double grossSalary,tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
       grossSalary = (percentage * grossSalary) / 100 + grossSalary;
    }

    public String toString(){
        return "Employee: " + name + ", $ " + String.format("%.2f",NetSalary());

    }
}
