import java.util.Scanner;

public class LowerCaseDemo {

    static String low(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result += ch;
        }

        return result;
    }

    static boolean compare(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String userResult = low(text);
        String builtInResult = text.toLowerCase();

        System.out.println("User Method    : " + userResult);
        System.out.println("Built-in Method: " + builtInResult);
        System.out.println("Same Result    : " + compare(userResult, builtInResult));

        sc.close();
    }
}