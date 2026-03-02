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
        System.out.println("Välj en produkt (0 = betala): ");

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Du måste skriva en siffra!");
            scanner.next();
            return -1;
        }
    }

    public void showReceipt(CheckOut checkOut) {
        System.out.println("Kvitto :)");

        for (Product product : checkOut.getProducts()) {
            System.out.println(product.getName() + "  " + product.getPrice() + " kr");
        }
        System.out.println("Totalt: " + checkOut.calculateTotalPrice() + " kr");
    }
}
