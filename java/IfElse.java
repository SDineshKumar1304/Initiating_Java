package Testjava.demo;
import java.util.Scanner;

public class IfElse {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		String color ;String size;
		System.out.print("Enter your t shirt size : ");
		size=obj.next();
		System.out.print("Enter the t-shirt color : ");
		color=obj.next();
		if (color=="Black") {
			System.err.println("Here is your T-Shirt");
		}
		else if(size=="xl"){
			System.err.println("Here is your T-Shirt");
		}
		else {
			System.err.println("No T-shirt Available");
		}
		obj.close();
	}
	
}
