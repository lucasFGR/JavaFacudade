package Exercicios.Exercicio3.entities;

public class Student {
    public String name;
    public double primeiroTrimestre,
            segundoTrimestre,
            terceiroTrimestre;

    public double FinalNote(){
        return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
    }

    public String Aproved() {
        if(FinalNote() >= 60.00){
            System.out.println("FINAL GRADE = " + FinalNote());
            return "PASS";
        }else {
            double missingPoints = FinalNote() - 60.00;
            System.out.println("FINAL GRADE = " + FinalNote());
            System.out.println("MISSING " + missingPoints + " POINTS");
            return "FALIED";
        }


    }

}
