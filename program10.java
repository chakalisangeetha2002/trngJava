import java.util.Scanner;
class program10
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("enter two numbers");
int num1=scob.nextInt();
int num2=scob.nextInt();
int i=0;
while(i<5)
{
System.out.println("1:Addition");
System.out.println("2:Substraction");
System.out.println("3:multiplication");
System.out.println("4:Division");
System.out.println("5:Modulus division");
int choice=scob.nextInt();
switch(choice)
{
case 1:{System.out.println(num1+"+"+num2+"="+(num1+num2));break;}
 case 2:{System.out.println(num1+"-"+num2+"="+(num1-num2));break;}
case 3:{System.out.println(num1+"*"+num2+"="+(num1*num2));break;}
case 4:{System.out.println(num1+"/"+num2+"="+(num1/num2));break;}
 case 5:{System.out.println(num1+"%"+num2+"="+(num1%num2));break;}
}//switch
i=i+1;
}//while
}//main()
}//class
















