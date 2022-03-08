package Empresa;

public class Notas {
	private double nota1;
	private double nota2;
	private int faltas;
	
	//Declarando os m�todos GET  e SET das notas
	public void setNota1(double nota) {
		
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida");
			return;
		}
		nota1 = nota;
	}
	
	public void setNota2(double nota) {
		
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida");
			return;
		}
		nota2 = nota;
	}
	
	// Declarando os m�todos GET das notas
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	// Declarando os m�todos GET e SET das faltas
	
	public int getFaltas(int faltas) {
		return faltas;
	}
	
	public int setFaltas(int faltas) {
		
		if (faltas > 7) {
			System.out.println("Reprovado por faltas.");
			return faltas;
		}
		
		return faltas;
	}
	
	
	// Criando o m�todo resultado para trazer a m�dia
	void resultado() {
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Media final " + media);
		System.out.println("quanidde de faltas " + faltas);
		
		if(media <4) {
			System.out.println("Reprovado");
		}else if (media <7) {
			System.out.println("Exame final");
		}else {
			System.out.println("Aprovado");
		}
			
	}
}
