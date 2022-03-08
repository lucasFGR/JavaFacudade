package Empresa;

public class principal {

	public static void main(String[] args) {
		Notas mario = new Notas();
		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFaltas(5);
		
		mario.resultado();
		
		mario.setNota1(2);
		mario.setFaltas(10);
		
		mario.resultado();

	}

}
