import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> studentGrades = new ArrayList<>();

        double sum = 0;
        System.out.println("Enter grades (0 or negative to stop):");
        while(true) {
            double grade = sc.nextDouble();

            if (grade <= 0) {
                break;
            } else {
                studentGrades.add(grade);
                sum += grade;
            }

        }

        if (studentGrades.isEmpty()) {
            System.out.println("No grades were entered.");
            sc.close();
            return;
        }

        System.out.println("Total Grades: " + studentGrades.size());
        for(int i = 0; i < studentGrades.size(); i++) {
            System.out.println("Grade " + (i + 1) + ": " + studentGrades.get(i));
        }

        double highestGrade = Double.MIN_VALUE;
        double lowestGrade = Double.MAX_VALUE;

        for (double grades : studentGrades) {
            if (grades > highestGrade) {
                highestGrade = grades;
            }

            if (grades < lowestGrade) {
                lowestGrade = grades;
            }
        }

        double average = sum / studentGrades.size();

        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
        System.out.printf("Average grade: %.2f%n", average);

        sc.close();
    }
}