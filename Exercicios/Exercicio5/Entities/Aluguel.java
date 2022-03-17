package Exercicios.Exercicio5.Entities;

public class Aluguel {

    private String name,email;
    private  int numberRom;

    public Aluguel(String name,String email,int numberRom){
        this.name = name;
        this.email = email;
        this.numberRom = numberRom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getNumberRom() {
        return numberRom;
    }

    public void setNumberRom(int numberRom) {
        this.numberRom = numberRom;
    }
}
