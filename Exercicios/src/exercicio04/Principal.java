package exercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1,n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa para verificar se 2 n�meros s�o Multiplos");
		
		System.out.println("Digite o primeiro n�mero");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("S�o Multiplos");
		}else {
			System.out.println("N�o s�o Multiplos");
		}
		
		
		sc.close();

	}

}
