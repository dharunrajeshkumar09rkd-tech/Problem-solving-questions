import java.util.InputMismatchException;
import java.util.Scanner;

public class P8_ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] resultArray = new int[1];

        try {
            System.out.print("Enter two integers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            resultArray[0] = result;

        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds.");
        } catch (InputMismatchException e) {
            System.out.println("Exception: Invalid input. Enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
