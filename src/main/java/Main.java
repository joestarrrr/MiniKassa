import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CheckOut checkOut = new CheckOut();
        Display display = new Display();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        display.showManu(menu.getProducts());
        int choice = -1;

        while (choice != 0) {
            choice = display.chooseProduct(scanner);

            if (choice != 0) {
                int index = choice - 1;

                if (index < 0 || index >= menu.getProducts().size()) {
                    System.out.println("Ogiltigt val, försök igen.");
                    continue;
                }

                Product selectedProduct = menu.getProducts().get(index);
                checkOut.addProducts(selectedProduct);

                System.out.println("La till: " + selectedProduct.getName());
            }
        }

        display.showReceipt(checkOut);
    }
}
