package exercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int n1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		n1 = sc.nextInt();
		
		if(n1 < 0) {
			System.out.println("N�mero negativo");
		}else {
			System.out.println("N�mero positvo");
		}
		
		
		
		
		sc.close();
		
	}

}
