import java.util.Scanner;

public class SubstringDemo {

    static String mySubstring(String t, int s, int e) {
        String a = "";

        for (int i = s; i < e; i++)
            a += t.charAt(i);

        return a;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        String u = mySubstring(t, s, e);
        String b = t.substring(s, e);

        System.out.println(compare(u, b));
    }
}