package Exercicios.Exercicios6;

import Exercicios.Exercicios6.Entities.Funcionario;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> FuncionariosCad = new ArrayList<>();

        System.out.print("Qual a quantidade de funcionários: ");
        int qtdFuncionarios = sc.nextInt();

        for ( int i =  0; i < qtdFuncionarios;i++){
            sc.nextLine();
            System.out.println("Funcionário #" + i);

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Salário: ");
            float salario = sc.nextFloat();

            Funcionario funcionario = new Funcionario(id,name,salario);
            FuncionariosCad.add(funcionario);
        }

            System.out.println("Lista de empregados:");

        for (Funcionario person: FuncionariosCad) {
            System.out.println(person.getId() +", " + person.getName()+ ", " +  person.getSalario());
        }

        System.out.print("Digite o ID do funcinário que vai receber o aumento: ");
        int idFuncionario = sc.nextInt();
        System.out.print("Entre com a porcentagem: ");
        double porcentagem = sc.nextDouble();

        for (Funcionario person: FuncionariosCad){
            if( person.getId() == idFuncionario){
                person.AumentaSalario(porcentagem);
            }
        }

        for (Funcionario person: FuncionariosCad) {
            System.out.println(person.getId() +", " + person.getName()+ ", " +  person.getSalario());
        }

        sc.close();
    }
}
