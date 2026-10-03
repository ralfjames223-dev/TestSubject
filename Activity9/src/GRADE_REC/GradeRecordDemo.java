package GRADE_REC;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeRecordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GradeRecord> gradeRecords = new ArrayList<>();

        while (true) {
            System.out.print("Enter subject name (or 'done' to finish): ");
            String sub = sc.nextLine();

            if (sub.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter score for Quiz 1: ");
            double q1 = sc.nextDouble();

            System.out.print("Enter score for Quiz 2: ");
            double q2 = sc.nextDouble();

            System.out.print("Enter score for Quiz 3: ");
            double q3 = sc.nextDouble();

            sc.nextLine();

            if (q1 >= 0 && q1 <= 100 && q2 >= 0 && q2 <= 100 && q3 >= 0 && q3 <= 100) {
                GradeRecord record = new GradeRecord(sub, q1, q2, q3);
                gradeRecords.add(record);
            } else {
                System.out.println("Invalid score! All scores must be between 0 and 100. Record not saved.");
            }
        }

        if (gradeRecords.isEmpty()) {
            System.out.println("No grade records to display.");
        } else {
            double totalAverage = 0;

            System.out.println("\n===== GRADE REPORT =====");

            for (GradeRecord grades : gradeRecords) {
                grades.displayReport();
                totalAverage += grades.getAverage();
            }

            double overallAverage = totalAverage / gradeRecords.size();
            System.out.printf("Overall Average Across All Subjects: %.2f%n", overallAverage);
            System.out.println("Total Subjects Recorded: " + gradeRecords.size());

        }
        sc.close();
    }
}