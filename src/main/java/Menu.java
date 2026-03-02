import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Product> products = new ArrayList<>();

    public Menu() {
        products.add(new Product(50, "Banan (per styck)"));
        products.add(new Product(100, "Mjölk (500 ml)"));
        products.add(new Product(200, "Ris (500 g)"));
        products.add(new Product(19, "RedBull (per styck)"));
        products.add(new Product(10, "Öl (per styck)"));
    }

    public List<Product> getProducts() {
        return products;
    }
}
