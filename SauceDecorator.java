public class SauceDecorator extends MealDecorator {
public SauceDecorator(Meal meal) {
super(meal);
}


public String getDescription() {
return meal.getDescription() + ", Extra Sauce";
}


public double getCost() {
return meal.getCost() + 20.0;
}
}
