import java.util.Scanner;
public class NaturalSumWhile{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<=0){System.out.println("Not a natural number");return;}
int i=1,sum=0;
while(i<=n){sum+=i;i++;}
int f=n*(n+1)/2;
System.out.println(sum);
System.out.println(f);
System.out.println(sum==f);
}}