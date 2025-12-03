import java.util.*;

public class Treeset_Sorting {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(70);
        ts.add(60);
        ts.add(20);
        ts.add(40);
        ts.add(80);

        System.out.println("Sorted: " + ts);
        System.out.println("Min: " + ts.first());
        System.out.println("Max: " + ts.last());
        System.out.println("HeadSet (<40): " + ts.headSet(40));
        System.out.println("TailSet (>=40): " + ts.tailSet(40));
    }
}
