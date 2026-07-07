import java.util.Scanner;

public class ArrayIndexDemo {

    static void handle(String[] arr) {

        try {
            // Accessing an invalid index
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter " + n + " names:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        handle(arr);

        sc.close();
    }
}