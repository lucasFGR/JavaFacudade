package Empresa;

public class Notas {
	private double nota1;
	private double nota2;
	private int faltas;
	
	//Declarando os métodos GET  e SET das notas
	public void setNota1(double nota) {
		
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida");
			return;
		}
		nota1 = nota;
	}
	
	public void setNota2(double nota) {
		
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida");
			return;
		}
		nota2 = nota;
	}
	
	// Declarando os métodos GET das notas
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	// Declarando os métodos GET e SET das faltas
	
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
	
	
	// Criando o método resultado para trazer a média
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
