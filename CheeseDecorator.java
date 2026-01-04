public class CheeseDecorator extends MealDecorator {
public CheeseDecorator(Meal meal) {
super(meal);
}


public String getDescription() {
return meal.getDescription() + ", Cheese";
}


public double getCost() {
return meal.getCost() + 30.0;
}
}
