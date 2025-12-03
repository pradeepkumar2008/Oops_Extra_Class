import java.time.LocalTime;

interface Logger {
    void log(String msg);

    default void timestamp() {
        System.out.println("Time: " + LocalTime.now());
    }

    static void info() {
        System.out.println("Logger Active");
    }
}

class ConsoleLogger implements Logger {
    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}

public class Default_Static_Interface {
    public static void main(String[] args) {
        ConsoleLogger c = new ConsoleLogger();
        c.log("Hello");
        c.timestamp();
        Logger.info();
    }
}
