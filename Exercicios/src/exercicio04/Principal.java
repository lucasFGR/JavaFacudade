package exercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1,n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa para verificar se 2 números são Multiplos");
		
		System.out.println("Digite o primeiro número");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não são Multiplos");
		}
		
		
		sc.close();

	}

}
