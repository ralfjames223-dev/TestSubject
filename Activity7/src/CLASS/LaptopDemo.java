package CLASS;

public class LaptopDemo {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Asus", 25000.0, 24.0, (short) 2017, true);

        Laptop.Processor GPU = new Laptop.Processor(6.7, "MSI");

        GPU.setNumCores(16);

        GPU.displayInfo();

        System.out.println("Model: " + laptop.getModel());
        System.out.println("Price: " + laptop.getPrice());
        System.out.println("Discount: " + laptop.getDiscount());
        System.out.println("Year: " + laptop.getYear());
        System.out.println("Has Accessories: " + (laptop.isHasAccessories() ? "Yes" : "No"));
        System.out.println("Final Price: " + laptop.getFinalPrice());
        System.out.println("Cores: " + GPU.getNumCores());
        System.out.println("Laptop Count: " + Laptop.getCount());
    }
}