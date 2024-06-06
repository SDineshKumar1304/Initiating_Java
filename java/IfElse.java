package Testjava.demo;
import java.util.Scanner;

public class IfElse {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		int a ;int b;int c;
		System.out.print("Enter the value a : ");
		a=obj.nextInt();
		System.out.print("Enter the value b : ");
		b=obj.nextInt();
		System.out.print("Enter the value c : ");
		c=obj.nextInt();
		if (a>b & a>c) {
			System.err.println("a is Greater");
		}
		else if(b>c){
			System.err.println("b is Greater");
		}
		else {
			System.err.println("c is Greater");
		}
		obj.close();
	}
	
}
