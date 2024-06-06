package Testjava.demo;
import java.util.Scanner;
public class UserAdd{
	public static void main(String[]args) {
		int a;int b;int c;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		a=obj.nextInt();
		System.out.print("Enter the Second number : ");
		b=obj.nextInt();
		c=a+b;
		System.err.println("The sum of two numbers :"+c);
	    obj.close();
	}
}