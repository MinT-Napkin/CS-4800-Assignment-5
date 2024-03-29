public class FoodItemWithMustard extends FoodItemDecorator {
    private FoodItem decoratedFoodItem;
    private double toppingPrice;

    public FoodItemWithMustard(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        double mustardPrice = 1.0;
        return decoratedFoodItem.getPrice() + mustardPrice;
    }
}