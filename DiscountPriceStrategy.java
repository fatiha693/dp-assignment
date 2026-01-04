public class DiscountPriceStrategy implements PricingStrategy {
public double calculatePrice(double basePrice) {
return basePrice * 0.9;
}
}
