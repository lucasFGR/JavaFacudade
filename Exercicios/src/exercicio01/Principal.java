package exercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1,n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor digite dois n�meros: ");
		
		System.out.printf("Digite o primeiro n�mero: %n");
		n1 = sc.nextInt();
		
		System.out.printf("Digite o outro n�mero: %n ");
		n2 = sc.nextInt();
		
		
		System.out.printf("Voc� digitou %d e %d, a soma desses dois valores � %d.",n1,n2,n1+n2);
		sc.close();

	}

}
