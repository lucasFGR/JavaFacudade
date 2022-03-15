package POO;

import java.util.Locale;
import java.util.Scanner;

import  POO.entities.Triangle;

public class Program {

    public static void main(String[] args) {

        // SOLUÇÃO SEM APLICAR POO
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the mesures of trangle X: ");

        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the mesures of trangle y: ");

        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p -xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p -yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X are : %4f%n", areaX);
        System.out.printf("Triangle Y are: %4f%n",areaY);

        if (areaX > areaY){
            System.out.println("Larger are : x");
        }else{
            System.out.println("Larger area : Y");
        }
        sc.close();

         */

        //Solução aplicando POO

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       Triangle x,y;

       x = new Triangle();
       y = new Triangle();


        System.out.println("Enter the mesures of trangle X: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the mesures of trangle y: ");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X are : %4f%n", areaX);
        System.out.printf("Triangle Y are: %4f%n",areaY);

        if (areaX > areaY){
            System.out.println("Larger are : x");
        }else{
            System.out.println("Larger area : Y");
        }
        sc.close();
    }
}
