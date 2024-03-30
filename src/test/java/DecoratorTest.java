import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcreteFoodItemTest {
    @Test
    public void testConcreteFoodItemGetPrice() {
        ConcreteFoodItem foodItem = new ConcreteFoodItem(10.0);
        assertEquals(10.0, foodItem.getPrice());
    }

    // intentionally failing test
    @Test
    public void failTestConcreteFoodItemGetPrice() {
        ConcreteFoodItem foodItem = new ConcreteFoodItem(15.0);
        assertEquals(10.0, foodItem.getPrice());
    }
}

class FoodItemDecoratorTest {

    @Test
    public void testFoodItemWithKetchupGetPrice() {
        FoodItem foodItem = new ConcreteFoodItem(10.0);
        FoodItemDecorator decorator = new FoodItemWithKetchup(foodItem);
        assertEquals(10.4, decorator.getPrice());
    }

    @Test
    public void testFoodItemWithKetchupAndMustardGetPrice() {
        FoodItem foodItem = new ConcreteFoodItem(10.0);
        FoodItemDecorator decorator = new FoodItemWithKetchupAndMustard(foodItem);
        assertEquals(11.1, decorator.getPrice());
    }

    @Test
    public void testFoodItemWithMustardGetPrice() {
        FoodItem foodItem = new ConcreteFoodItem(10.0);
        FoodItemDecorator decorator = new FoodItemWithMustard(foodItem);
        assertEquals(10.7, decorator.getPrice());
    }
}

class LoyaltyStatusTest {

    @Test
    public void testApplyDiscount() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1); // 10% discount
        assertEquals(90.0, loyaltyStatus.applyDiscount(100.0));
    }
}

class OrderTest {

    @Test
    public void testAddItem() {
        Order order = new Order();
        FoodItem foodItem = new ConcreteFoodItem(10.0);
        order.addItem(foodItem);
        assertTrue(order.getItems().contains(foodItem));
    }

    @Test
    public void testGetTotalCost() {
        Order order = new Order();
        FoodItem foodItem = new ConcreteFoodItem(10.0);
        order.addItem(foodItem);
        assertEquals(10.0, order.getTotalCost());
    }
}