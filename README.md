# dp-assignment
Project Title
Online Food Ordering System Using Multiple Design Patterns

Description
This project demonstrates the combined use of Strategy, Decorator, Factory, and Template patterns in a single real-world scenario. The system simulates an online food ordering process where meals are created dynamically, enhanced with add-ons, priced using different pricing rules, and prepared following a fixed sequence of steps.

Scenario Summary
A customer orders a meal from an online food ordering system.
The system creates the base meal using a factory.
Optional add-ons are applied using decorators.
The final price is calculated using a selected pricing strategy.
The meal is prepared using a predefined preparation process defined by a template.

Design Patterns Used

Factory
Used to create base meal objects without exposing concrete classes.

Decorator
Used to add optional features such as cheese or extra sauce dynamically.

Strategy
Used to apply different pricing rules such as regular pricing or discounted pricing.

Template
Used to define a fixed sequence for meal preparation while allowing variation in cooking steps.

Technology
Programming Language: Java

Project Structure

Meal.java
BaseMeal.java
VegMeal.java
ChickenMeal.java
MealDecorator.java
CheeseDecorator.java
SauceDecorator.java
PricingStrategy.java
RegularPriceStrategy.java
DiscountPriceStrategy.java
MealFactory.java
MealPreparationTemplate.java
VegMealPreparation.java
ChickenMealPreparation.java
Main.java

How to Run

Clone or download the project

Open the project in any Java IDE

Compile all Java files

Run Main.java

Expected Output

The program prints the meal description with selected add-ons
It prints the final calculated price
It prints the meal preparation steps in order

Example Flow

Chicken meal is created
Cheese and extra sauce are added
Discount pricing strategy is applied
Meal preparation steps are executed
