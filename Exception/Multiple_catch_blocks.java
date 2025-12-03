import java.util.*;

public class Multiple_catch_blocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];

        try {
            System.out.print("Enter index (0–2): ");
            int index = sc.nextInt();

            System.out.print("Enter value: ");
            int value = sc.nextInt();

            arr[index] = value;
            System.out.println("Inserted successfully!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter only numbers!");
        }
    }
}
