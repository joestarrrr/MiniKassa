import java.util.List;

public class Display {

    public void showManu(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i+1) + "."
                    +product.getName()+
                    "-"
                    +product.getPrice() + "kr");
        }

    }
}
