import java.util.*;

public class ArrayList_practice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Amit");
        list.add("Riya");
        list.add("Saurav");
        list.add("Neha");
        list.add("Raj");

        list.remove("Neha");
        list.set(1, "Priya");

        System.out.println(list);
        System.out.println("Size = " + list.size());
    }
}
