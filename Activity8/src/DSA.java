import java.util.LinkedList;
import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> students = new LinkedList<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student's name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student's ID: ");
                    String id = sc.nextLine();

                    students.add("Name: " + name + " | ID: " + id);
                    System.out.println("Added!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("The List is empty. No Students.");
                    } else {
                        System.out.println("All Students:");

                        for (String stn : students) {
                            System.out.println(stn);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter a name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < students.size(); i++) {
                        String student = students.get(i);

                        if (student.startsWith("Name: " + search + " |")) {
                            System.out.println("Name found at index: " + i);
                            System.out.println(student);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter a name to delete: ");
                    String delete = sc.nextLine();

                    boolean deletes = false;

                    for (int i = 0; i < students.size(); i++) {
                        String student = students.get(i);

                        if (student.startsWith("Name: " + delete + " |")) {
                            students.remove(i);
                            System.out.println("Removed!");
                            deletes = true;
                            break;
                        }
                    }

                    if (!deletes) {
                        System.out.println("NOTHING.");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }

        }
    }
}