import java.util.Scanner;
import java.util.ArrayList;

class Object {
    private String name;
    private String origin;
    private static int count;

    public Object(String name, String origin) {
        this.name = name;
        this.origin = origin;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Object.count = count;
    }

    public void display() {
        System.out.println(name);
        System.out.println(origin);
        System.out.println(getCount());
    }
}


public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> objects = new ArrayList<>();

        System.out.print("How many: ");
        int counting = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < counting; i++) {
            System.out.print("Enter Object name: ");
            String name = sc.nextLine();

            System.out.print("Enter Object Origin: ");
            String origin = sc.nextLine();

            Object obj = new Object(name, origin);
            objects.add(obj);
        }

        System.out.println("\nAll Objects:");

        for (Object objs : objects) {
            System.out.println("Name: " + objs.getName());
            System.out.println("Origin: " + objs.getOrigin());
        }

        System.out.println("\nTotal objects created: " + Object.getCount());

        sc.close();
    }
}