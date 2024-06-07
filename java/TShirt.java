package Testjava.demo;
import java.util.Scanner;
public class TShirt {
	public static void main(String[] args) {
		char size ;
		char color;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Your T-Shirt Color : ");
		color=obj.next().charAt(0);
		System.out.println(color);
		
		System.out.print("Enter yourl T-shirt Size : ");
		size=obj.next().charAt(0);
		System.out.println(size);
		if (size=='x' && color=='b')
		{
			System.out.println("Here is your T-Shirt");
		}
		else {
			System.err.println("No T-Shirt available");
		}
		obj.close();
	}
}

