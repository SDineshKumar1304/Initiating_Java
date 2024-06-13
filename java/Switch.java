package DineshNew;
import java.util.Scanner;
public class Switch {
 static Scanner obj = new Scanner(System.in);
  public static void main(String[] args) {
	System.out.print("Enter your Switch Case : ");
	int c = obj.nextInt();
	System.out.println("Your Switch Case is : "+c);
	switch (c) {
	case 1:
		System.out.println("Hi");
		break; // We need to use Break Statements to break the case , because if we dont use it will return all cases 
	case 2:
		System.out.println("Hello");
		break;
	case 3:
		int a ,b;
		System.out.print("Enter the Value a : ");
		a = obj.nextInt();
		System.out.print("Enter the Value b : ");
		b = obj.nextInt();
		System.out.println("The sum of two Numbers : "+ (a+b));
		break;
	
	default:
		System.out.println("No Cases are Choosen are in the Cases!!! ");
		
	}
 }
}
