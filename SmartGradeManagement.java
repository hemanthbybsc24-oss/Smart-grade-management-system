import java.util.Scanner;

class Student {
    String name;
    int[] marks;
    int total = 0;
    double average;
    String grade;

    Student(String name, int subjects) {
        this.name = name;
        this.marks = new int[subjects];
    }

    void inputMarks(Scanner sc) {
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        average = (double) total / marks.length;
        assignGrade();
    }

    void assignGrade() {
        if (average >= 85) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 50) grade = "C";
        else grade = "Fail";
    }

    void displayRow() {
        System.out.printf("%-15s %-12d %-10.2f %-10s%n", name, total, average, grade);
    }
}

public class SmartGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Smart Grade Management System ");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of Student " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter number of subjects: ");
            int sub = sc.nextInt();

            students[i] = new Student(name, sub);
            students[i].inputMarks(sc);
        }

        System.out.println("\n===== Final Grade Report =====");
        System.out.printf("%-15s %-12s %-10s %-10s%n", "Name", "Total Marks", "Average", "Grade");
        System.out.println("--------------------------------------------------");

        for (Student s : students) s.displayRow();

        sc.close();
    }
}
