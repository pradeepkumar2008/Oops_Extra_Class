import java.util.*;

public class C_Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Delhi");
        set.add("Mumbai");
        set.add("Delhi"); // duplicate
        set.add("Kolkata");

        System.out.println(set);
        System.out.println("Contains Mumbai? " + set.contains("Mumbai"));
    }
}
