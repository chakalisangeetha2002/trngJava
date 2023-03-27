import java.util.Scanner;
class day3program01
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextint();
int num2=sc.nextInt();
int res=num1/num2;
System.out.println(num1+"/"+num2+"="+res);
System.out.println(num1+"%"+num2+"="+res);
}
}