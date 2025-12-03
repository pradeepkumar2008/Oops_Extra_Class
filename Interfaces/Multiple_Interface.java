interface Printable {
    default void display() { System.out.println("Printable Display"); }
}

interface Showable {
    default void display() { System.out.println("Showable Display"); }
}

class Document implements Printable, Showable {
    public void display() {
        System.out.println("Resolved display() in Document");
    }
}

public class Multiple_Interface {
    public static void main(String[] args) {
        new Document().display();
    }
}
