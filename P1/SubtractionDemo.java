import java.util.Scanner;
import java.util.InputMismatchException;

public class SubtractionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Result: " + (a - b));
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter integers only.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        }
    }
}
