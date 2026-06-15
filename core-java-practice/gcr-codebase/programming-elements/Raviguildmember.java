public class Raviguildmember{
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 21;
        char rank = 'A';
        double salary = 50000.50;
        float membershipFee = 999.99f;

        double annualBonus = salary + 0.12 * salary;
        int bonusInt = (int) annualBonus;
        System.out.println("");
        System.out.println("        WELCOME CARD");
        System.out.println("");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : Rs. " + salary);
        System.out.println("Membership Fee : Rs. " + membershipFee);
        System.out.println("Annual Bonus   : Rs. " + bonusInt);
        System.out.println("");
        System.out.println("Welcome to the coding guide, " + name + "!");



        
    }
}
