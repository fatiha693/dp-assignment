public class MealFactory {
public static Meal createMeal(String type) {
if (type.equalsIgnoreCase("veg")) {
return new VegMeal();
}
if (type.equalsIgnoreCase("chicken")) {
return new ChickenMeal();
}
return null;
}
}
