/**
 * Created by Ronja on 2018-09-20.
 */
public class Grocery extends Goods {

    double weightInKg;

    public Grocery(String name, double price, String description, double weightInKg) {
        super(name, price, description);
        this.weightInKg = weightInKg;
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Weight: "+ weightInKg + " kg");
    }
}
