interface Important {}

class Employee implements Important {}

public class Marker_Interface {
    public static void main(String[] args) {
        Employee e = new Employee();

        if (e instanceof Important) {
            System.out.println("Important object detected");
        }
    }
}
