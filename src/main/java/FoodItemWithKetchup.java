public class FoodItemWithKetchup extends FoodItemDecorator {
    private FoodItem decoratedFoodItem;
    private double toppingPrice;

    public FoodItemWithKetchup(FoodItem foodItem) {
        super(foodItem);
        toppingPrice = 0.5;
    }

    @Override
    public double getPrice() {
        return decoratedFoodItem.getPrice();
    }
}