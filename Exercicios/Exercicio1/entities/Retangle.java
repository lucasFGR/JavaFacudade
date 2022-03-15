package Exercicios.Exercicio1.entities;

public class Retangle {
    public double width,height;

    public double Area(){
        return height * width;
    }

    public double Perimeter(){
        return (height + width ) * 2;
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(height,2) + Math.pow(width,2));
    }

    public String toString(){
        return "AREA = "
                + String.format("%.2f",Area())
                + " PERIMETER = "
                + String.format("%.2f",Perimeter())
                + " DIAGONAL = "
                + String.format("%.2f",Diagonal());
    }
}
