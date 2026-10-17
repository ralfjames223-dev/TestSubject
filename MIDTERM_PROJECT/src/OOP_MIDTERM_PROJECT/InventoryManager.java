package OOP_MIDTERM_PROJECT;
import java.util.Scanner;
import java.util.ArrayList;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        do {
            System.out.println("=== Inventory Management System ===");
            System.out.println("A. Add New Product");
            System.out.println("B. Remove Product by Code");
            System.out.println("C. Update Product Stock by Code");
            System.out.println("D. Display All Products");
            System.out.println("E. Exit");
            System.out.print("Choose an option: ");
            char option = Character.toUpperCase(sc.next().charAt(0));

            switch (option) {
                case 'A':
                    addProduct(sc, products);
                    break;
                case 'B':
                    removeProduct(sc, products);
                    break;
                case 'C':
                    updateStock(sc, products);
                    break;
                case 'D':
                    displayAllProducts(products);
                    break;
                case 'E':
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Please choose A, B, C, D, or E.");
            }

        } while (true);

    }

    public static void addProduct(Scanner sc, ArrayList<Product> products) {
        sc.nextLine(); // clear leftover newline
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Product Stock Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, code, price, quantity);
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public static void removeProduct(Scanner sc, ArrayList<Product> products) {
        sc.nextLine(); // clear leftover newline
        System.out.print("Enter Product Code to Remove: ");
        String code = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductCode().equalsIgnoreCase(code)) {
                products.remove(i);
                System.out.println("Product removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product with code \"" + code + "\" not found.");
        }
    }

    public static void updateStock(Scanner sc, ArrayList<Product> products) {
        sc.nextLine(); // clear leftover newline
        System.out.print("Enter Product Code to Update Stock: ");
        String code = sc.nextLine();

        boolean found = false;
        for (Product p : products) {
            if (p.getProductCode().equalsIgnoreCase(code)) {
                System.out.print("Enter New Stock Quantity: ");
                int newQty = sc.nextInt();
                p.setStockQuantity(newQty);
                System.out.println("Stock updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product with code \"" + code + "\" not found.");
        }

    }

    public static void displayAllProducts(ArrayList<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }

        System.out.println("=== All Products ===");
        for (Product p : products) {
            p.displayProduct();
        }

        // Print the total number of unique products
        System.out.println("Total unique products in system: " + products.size());
        System.out.println("========================================");
    }

}