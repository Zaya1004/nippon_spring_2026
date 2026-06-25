package mn.icode;

import java.util.jar.Attributes.Name;

public class PremiumProduct implements Taxable, Discountable{
     String name;
     double basePrice;
     public PremiumProduct(String name, double basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}
     
     @Override
    public double taxRate() {
    	// TODO Auto-generated method stub
    	return 0.10;
    }
     
     @Override
    public double discountRate() {
    	// TODO Auto-generated method stub
    	return 0.15;
    }
     
     
    double finalPrice() {
    	return priceAfterDiscount(basePrice) + taxAmount(basePrice);
    }
    
    void showPricing() {
        double discounted = priceAfterDiscount(basePrice);
        System.out.println("Product:    " + name);
        System.out.printf("Base: ", basePrice);
        System.out.printf("Discount:   -%.0f (%.0f%%)%n",
            discountAmount(basePrice), discountRate() * 100);
        System.out.printf("After disc: %.0f%n", discounted);
        System.out.printf("Tax:        +%.0f (%.0f%%)%n",
            taxAmount(discounted), taxRate() * 100);
        System.out.printf("Final:      %.0f%n", finalPrice());
    }
    
}
