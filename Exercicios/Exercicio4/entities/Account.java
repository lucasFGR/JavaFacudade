package Exercicios.Exercicio4.entities;

public class Account {
   private int number;
   private String name;
   private double balance;
   private  double  initialDeposite = 0.0;

   //Constructors
   public Account(int number,String name){
       this.number = number;
       this.name = name;
   }

   public  Account(int number, String name,double initialDeposite){
       this.number = number;
       this.name = name;
       this.initialDeposite = initialDeposite;
   }

   //Methods get e set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(){
       return  number;
    }

    public void addMoney (double quantity){
        balance += quantity;
    }

    public void  withdrawMoney(double quantity){
       balance -= quantity + 5;
    }
    public String toString(){

        return "Accounnt "
                + number
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f",balance);
    }

}
