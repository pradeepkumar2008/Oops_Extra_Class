import java.util.*;

public class Iterator_ListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
            list.add(i);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x % 2 != 0) it.remove();
        }

        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()) {
            int x = lit.next();
            if (x % 2 == 0) {
                lit.add(100);
            }
        }

        System.out.println(list);
    }
}
