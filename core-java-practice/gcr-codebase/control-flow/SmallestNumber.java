import java.util.Scanner;
public class SmallestNumber{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int number1=sc.nextInt(),number2=sc.nextInt(),number3=sc.nextInt();
System.out.println("Is the first number the smallest? "+(number1<number2&&number1<number3));
}}