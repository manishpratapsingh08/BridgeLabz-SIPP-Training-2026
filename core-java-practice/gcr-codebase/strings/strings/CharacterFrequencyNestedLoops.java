import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    static String[] frequency(String text) {

        char[] ch = text.toCharArray();
        int[] freq = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;

            if (ch[i] == '0')
                continue;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }

        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0')
                count++;
        }

        String[] result = new String[count];

        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                result[index] = ch[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        String[] result = frequency(text);

        System.out.println("Character Frequency:");

        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}