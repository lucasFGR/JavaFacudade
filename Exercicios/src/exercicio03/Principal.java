package exercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int n1;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		n1 = sc.nextInt();
		
		if(n1  % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
