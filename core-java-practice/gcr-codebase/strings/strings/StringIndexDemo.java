import java.util.*;

public class StringIndexDemo {

    static void handle(String t) {
        try {
            System.out.println(t.charAt(t.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        handle(s.next());
    }
}