import java.util.Scanner;
class program04
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int max=0;
if(num1>num2)max=num1;
if(num2>num1)max=num2;
System.out.println(" largest out of   " + num1 + "  and  " + num2 + "  is  " +max);
}
}