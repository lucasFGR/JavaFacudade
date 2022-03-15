package POO2.entities;

public class Produtct {

    private String name;
    private double price;
    private int quantity;

    public Produtct(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Produtct(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public  String getName(){
        return name;
    }

    public  double getPrice(){
        return  price;
    }

    public  void setPrice(Double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProductsQuantity( int quantity){
        this.quantity += quantity;
    }

    public void removeProducts( int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f",price)
                + ", "
                + quantity
                + " units, total: $ "
                + String.format("%.2f",totalValueInStock());
    }

}
