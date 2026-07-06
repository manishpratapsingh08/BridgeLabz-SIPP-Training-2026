import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter age and height of Amar:");

        ages[0] = sc.nextInt();
        heights[0] = sc.nextDouble();

        System.out.println("Enter age and height of Akbar:");

        ages[1] = sc.nextInt();
        heights[1] = sc.nextDouble();

        System.out.println("Enter age and height of Anthony:");

        ages[2] = sc.nextInt();
        heights[2] = sc.nextDouble();

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < friends.length; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + friends[youngestIndex]);
        System.out.println("Age: " + ages[youngestIndex]);

        System.out.println("\nTallest Friend: " + friends[tallestIndex]);
        System.out.println("Height: " + heights[tallestIndex]);

        sc.close();
    }
}