import java.util.Scanner;
public class SmartGradeManagement {
    public static void main(String[] args) {
        Student[] students = new Student[n];
for (int i = 0; i < n; i++) {
System.out.print("\nEnter name of Student " + (i + 1) + ": ");
    String name = sc.next();
            System.out.print("Enter number of subjects: ");
            int sub = sc.nextInt();
    students[i] = new Student(name, sub);
            students[i].inputMarks(sc);
        }
    }
    }
}
