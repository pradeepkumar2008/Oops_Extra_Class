import java.io.*;

public class Finally_block {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            System.out.println("File opened successfully.");
        }
        catch (Exception e) {
            System.out.println("File not found.");
        }
        finally {
            System.out.println("File process finished");
        }
    }
}
