public class Main {
public static void main(String[] args) {
Meal meal = MealFactory.createMeal("chicken");
meal = new CheeseDecorator(meal);
meal = new SauceDecorator(meal);


PricingStrategy strategy = new DiscountPriceStrategy();
double finalPrice = strategy.calculatePrice(meal.getCost());


System.out.println(meal.getDescription());
System.out.println(finalPrice);


MealPreparationTemplate prep = new ChickenMealPreparation();
prep.prepareMeal();
}
}
