
package Testjava.demo;
import java.util.Scanner;
public class TShirt2 {
	public static void main(String[] args) {
		String size = "xl";
		String color= "Black";
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Your T-Shirt Color : ");
		color=obj.next();
		
		System.out.print("Enter your T-shirt Size : ");
		size=obj.next();
		if (size.equals("xl") && color.equals("Black")) {
			System.err.println("Here is your T-Shirt");
		}
		else {
			System.err.println("No T-Shirt available");
		}
		obj.close();
	}
}