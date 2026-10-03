package CLASS;

import java.util.Scanner;

public class StudentManager {
    static Student[] students;
    static int studentMax = 10;
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        students = new Student[studentMax];

        boolean loops = true;

        while (loops) {
            displayMenu();
            System.out.print("Choose an option: ");
            char choice = sc.nextLine().toLowerCase().charAt(0);

            switch (choice) {
                case 'a':
                    addStudent(sc);
                    break;

                case 'b':
                    removeStudent(sc);
                    break;

                case 'c':
                    displayStudents();
                    break;

                case 'd':
                    System.out.println("Good Bye!");
                    loops = false;
                    break;

                default:
                    System.out.println("Invalid.");
            }
        }

        sc.close();
    }

    public static void displayMenu() {
        System.out.println("\n===== STUDENT MANAGER =====");
        System.out.println("A. Add Student");
        System.out.println("B. Remove Student by ID");
        System.out.println("C. Display All Students");
        System.out.println("D. Exit");
    }

    public static void addStudent(Scanner sc) {
        if (studentCount >= studentMax) {
            System.out.println("Student list is full.");
            return;
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = Double.parseDouble(sc.nextLine());

        students[studentCount] = new Student(name, age, studentId, gpa);
        studentCount++;

        System.out.println("Student added successfully!");
    }

    public static void removeStudent(Scanner sc) {
        if (studentCount == 0) {
            System.out.println("No students found.");
            return;
        }

        System.out.print("Enter student ID to remove: ");
        String id = sc.nextLine();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId().equals(id)) {

                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[studentCount - 1] = null;
                studentCount--;

                System.out.println("Student removed successfully!");
                return;
            }
        }

        System.out.println("Student ID not found.");
    }

    public static void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students found.");
            return;
        }

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nStudent " + (i + 1));
            students[i].displayInfo();
        }
    }
}