package empresa;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Lucas",111,0.4,new Curso("ADS",1000));
		
		a1.info();
		System.out.println("Pagamento: " + a1.pagamento());

	}

}
