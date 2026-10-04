package OOP_MIDTERM_PROJECT;
import java.util.Scanner;
import java.util.ArrayList;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while(true) {
            System.out.println("=== Inventory Management System ===");
            System.out.println("A. Add New Product");
            System.out.println("B. Remove Product by Code");
            System.out.println("C. Update Product Stock by Code");
            System.out.println("D. Display All Products");
            System.out.println("E. Exit");
            System.out.print("Choose an option: ");
            char option = Character.toUpperCase(sc.next().charAt(0));

            switch(option) {
                case 'A':
                    ProductName(sc, products);
                    break;

                case 'B':

            }
        }
    }

    public static void ProductName(Scanner sc, ArrayList<Product> products) {
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
}