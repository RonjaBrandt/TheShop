/**
 * Created by Ronja on 2018-09-20.
 */
public class Goods {

    String name;
    double price;
    String description;


    public Goods(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void showInfo(){
        System.out.println("Name:"+ name + "."
        +"\nPrice: "+ price + " kr."
        +"\nDescription: "+ description+ ".");
    }
}
