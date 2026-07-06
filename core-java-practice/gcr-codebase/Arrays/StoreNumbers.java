import java.util.Scanner;

public class StoreNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        int index = 0;

        System.out.println("Enter numbers (Enter 0 or a negative number to stop):");

        while (index < numbers.length) {

            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        double total = 0;

        System.out.println("Numbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Sum of all numbers = " + total);

        sc.close();
    }
}