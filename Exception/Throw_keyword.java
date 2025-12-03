public class Throw_keyword {

    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        }
        System.out.println("Eligible!");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
