public class Driver {
    public static void main(String[] args) {
        FoodItem burger = new ConcreteFoodItem(5.0);
        FoodItem fries = new ConcreteFoodItem(2.0);

        FoodItem burgerWithKetchup = new FoodItemWithKetchup(burger);

        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);

        double totalCost = order.getTotalCost();

        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1); // 10% discount
        totalCost = loyaltyStatus.applyDiscount(totalCost);

        System.out.println("Total cost: $" + totalCost);
    }
}