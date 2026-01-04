public abstract class MealPreparationTemplate {
public final void prepareMeal() {
washIngredients();
cookMainItem();
plateMeal();
}


protected abstract void washIngredients();
protected abstract void cookMainItem();
protected void plateMeal() {
System.out.println("Meal plated");
}
}
