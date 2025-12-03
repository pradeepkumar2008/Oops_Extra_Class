import java.util.*;

public class Linkedlist_Queue {
    public static void main(String[] args) {
        LinkedList<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        q.addFirst(5);
        q.addLast(40);

        q.removeFirst();
        q.removeLast();

        System.out.println(q);
    }
}
