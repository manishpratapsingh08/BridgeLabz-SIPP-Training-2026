import java.util.Scanner;
public class SumUntilZero{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double total=0,x=sc.nextDouble();
while(x!=0){
total+=x;
x=sc.nextDouble();
}
System.out.println(total);
}}