import java.util.List;
import java.util.Scanner;

public class Display {

    Scanner scanner = new Scanner(System.in);

    public void showManu(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i+1) + "."
                    +product.getName()+
                    "-"
                    +product.getPrice() + "kr");
        }

    }

    public int chooseProduct(Scanner scanner) {
        System.out.println("Välj en produkt");
        int choice = scanner.nextInt();
        return choice;
    }
}
