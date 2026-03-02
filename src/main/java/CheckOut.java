import java.util.ArrayList;
import java.util.List;

public class CheckOut {

    private List<Product> checkOutList = new ArrayList<>();

    public void addProducts(Product product) {
        checkOutList.add(product);
    }

    public List<Product> getProducts() {
        return checkOutList;
    }

    public int calculateTotalPrice() {
        int total = 0;
        for(Product product : checkOutList) {
            total += product.getPrice();
        }
        return total;
    }

}
