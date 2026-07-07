import java.util.Scanner;

public class AnagramCheck {

    // Method to find length without using length()
    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    // Method to check if two strings are anagrams
    static boolean isAnagram(String s1, String s2) {

        int len1 = findLength(s1);
        int len2 = findLength(s2);

        if (len1 != len2)
            return false;

        int[] freq = new int[256];

        // Count frequency of first string
        for (int i = 0; i < len1; i++) {
            freq[s1.charAt(i)]++;
        }

        // Subtract frequency of second string
        for (int i = 0; i < len2; i++) {
            freq[s2.charAt(i)]--;
        }

        // Check frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String text1 = sc.next();

        System.out.print("Enter Second String: ");
        String text2 = sc.next();

        if (isAnagram(text1, text2))
            System.out.println("The strings are Anagrams.");
        else
            System.out.println("The strings are Not Anagrams.");

        sc.close();
    }
}