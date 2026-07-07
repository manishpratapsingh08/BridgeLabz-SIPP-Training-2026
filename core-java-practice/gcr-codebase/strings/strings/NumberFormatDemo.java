import java.util.*;

public class NumberFormatDemo {

    static void handle(String t) {
        try {
            System.out.println(Integer.parseInt(t));
        } catch (NumberFormatException e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        handle(s.next());
    }
}