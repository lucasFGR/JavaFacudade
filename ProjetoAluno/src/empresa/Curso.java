package empresa;

public class Curso {
	String nome;
	double mensalidade;
	
	public Curso (String nome, double mensalidade) {
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
	
	public Curso() {
		
	}
	
	void info() {
	System.out.println("Nome do curso: " + nome);
	System.out.println("Mensalidade : " + mensalidade);
	}
	
	

}
