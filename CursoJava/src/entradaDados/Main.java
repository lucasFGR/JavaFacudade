package entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char a;
		System.out.println("Digite uma string ");
		x = sc.next();
		
		System.out.println("Digite um numero inteiro ");
		y = sc.nextInt();
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite um double: ");
		z = sc.nextDouble();
		
		
		System.out.println("Digite um chat");
		a = sc.next().charAt(0);
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		
		
		sc.close();

	}

}
