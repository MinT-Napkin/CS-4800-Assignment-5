public class ConcreteFoodItem implements FoodItem {

    private final double basePrice;

    public ConcreteFoodItem(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}