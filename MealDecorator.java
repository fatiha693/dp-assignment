public abstract class MealDecorator implements Meal {
protected Meal meal;


public MealDecorator(Meal meal) {
this.meal = meal;
}
}
