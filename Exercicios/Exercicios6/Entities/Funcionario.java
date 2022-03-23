package Exercicios.Exercicios6.Entities;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int id;
    private  String name;
    private double salario;


    public Funcionario(int id, String name, float salario){
        this.id = id;
        this.name = name;
        this.salario = salario;
    }



    public String getName(){
        return name;
    }

    public  int getId(){
        return id;
    }

    public double getSalario(){
        return salario;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void AumentaSalario(double porcentagem){
        salario += porcentagem / 100 * salario;
    }



}
