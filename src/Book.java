/**
 * Created by Ronja on 2018-09-20.
 */
public class Book extends Goods implements HasShippingCost {

    public Book(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public double calculateCost(double distance) {
        return 0;
    }
}
