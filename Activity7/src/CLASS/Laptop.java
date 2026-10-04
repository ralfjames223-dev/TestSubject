package CLASS;

public class Laptop {
    private String model;
    private double price;
    private double discount;
    private short year;
    private boolean hasAccessories;
    private static int count = 0;

    public static class Processor {
        private double speed;
        private String maker;
        private int numCores;

        public Processor(double speed, String maker) {
            this.speed = speed;
            this.maker = maker;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public String getMaker() {
            return maker;
        }

        public void setMaker(String maker) {
            this.maker = maker;
        }

        public int getNumCores() {
            return numCores;
        }

        public void setNumCores(int numCores) {
            this.numCores = numCores;
        }

        public void displayInfo() {
            System.out.println("Processor Maker: " + maker);
            System.out.println("Processor Speed: " + speed);
        }
    }

    public Laptop(String model, double price, double discount, short year, boolean hasAccessories) {
        this.model = model;
        this.price = price;
        this.discount = discount;
        this.year = year;
        this.hasAccessories = hasAccessories;
        count++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isHasAccessories() {
        return hasAccessories;
    }

    public void setHasAccessories(boolean hasAccessories) {
        this.hasAccessories = hasAccessories;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Laptop.count = count;
    }

    public static int getAllCount() {
        return Laptop.count;
    }

    public double getFinalPrice() {
        return this.price - (this.price * (discount / 100));
    }
}