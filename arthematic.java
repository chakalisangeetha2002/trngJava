import java.util.Scanner;
class arthematic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int res=num1/num2;
System.out.println(num1+"/"+num2+"="+res);
System.out.println(num1+"%"+num2+"="+res);
}
}