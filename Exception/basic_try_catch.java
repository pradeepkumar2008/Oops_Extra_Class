import java.util.Scanner;
public class basic_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter divisor: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero! Please enter a valid divisor.");
        }
    }
}
