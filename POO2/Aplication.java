package POO2;

import POO2.entities.Produtct;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtct produtct = new Produtct();

        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        produtct.name = sc.nextLine();
        System.out.println("Price: ");
        produtct.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        produtct.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data >> " + produtct);

        System.out.println();
        System.out.println("Enter the number of products to b added in stock: ");

        int quantity = sc.nextInt();
        produtct.addProductsQuantity(quantity);

        System.out.println();
        System.out.println("Update data >> " + produtct);

        System.out.println();
        System.out.println("Enter the number to be removed in stock");
        quantity = sc.nextInt();

        produtct.removeProducts(quantity);
        System.out.println();
        System.out.println("Update data >>" + produtct);

        sc.close();

    }
}
