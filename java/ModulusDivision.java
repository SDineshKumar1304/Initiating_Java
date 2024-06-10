package Testjava.demo;
import java.util.Scanner;
public class ModulusDivision {

	public static void main(String[] args) {
		int a;int b=10;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your number : ");
		a=obj.nextInt();
		int last_digit = a % b;
		int last_digit_elimination = a / b;
		System.err.println("Result of last Digit using % : "+last_digit);
		System.err.println("Result after elimination of last Digit : "+last_digit_elimination);
		obj.close();
	}

}
