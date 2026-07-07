import java.util.*;

public class UpperCaseDemo {

    static String up(String t) {
        String r = "";

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (c >= 'a' && c <= 'z')
                c = (char) (c - 32);

            r += c;
        }

        return r;
    }

    static boolean cmp(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;

        return true;
    }

    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();

        System.out.println(cmp(up(t), t.toUpperCase()));
    }
}