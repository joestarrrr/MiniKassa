import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    @Test
    void listContainsASampleProduct() {
        Menu menu = new Menu();
        Product firstProduct = menu.getProducts().get(0);
        assertEquals("Banan (per styck)",firstProduct.getName());
        assertEquals(50, firstProduct.getPrice());
    }
}