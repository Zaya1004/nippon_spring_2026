package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceTest {
    @Test
    public void testPremiumProduct() {
    	PremiumProduct premiumProduct = new PremiumProduct("Flower", 60000);
        Assertions.assertNotEquals("Flower", premiumProduct.finalPrice());
    }
}
