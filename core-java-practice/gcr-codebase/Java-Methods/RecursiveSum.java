import java.util.Scanner;

public class RecursiveSum {

    static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
        } else {
            int recursion = recursiveSum(n);
            int formula = formulaSum(n);

            System.out.println("Recursive Sum = " + recursion);
            System.out.println("Formula Sum = " + formula);

            if (recursion == formula)
                System.out.println("Both results are correct.");
            else
                System.out.println("Results are different.");
        }

        sc.close();
    }
}