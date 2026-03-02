import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void constructorSetTheValueTest() {
        Product product = new Product(50, "Banan (per styck)");
        assertEquals(50, product.getPrice());
        assertEquals("Banan (per styck)", product.getName());
    }

    @Test
    void checkIfSetValueWorks() {
        Product product = new Product(50, "Banan (per styck)");
        product.setPrice(20);
        assertEquals(20,product.getPrice());
    }
}