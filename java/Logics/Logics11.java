package Logics;
import java.util.Scanner;
public class Logics11 {
	public static void main(String[] args) {
		int n; 
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		n = obj.nextInt();
		int last_digit = 0; int sum = 0; int prod = 1;
		while(n>0) {
			last_digit = n%10;
			sum  = sum +last_digit;
			prod = prod*last_digit;
			n = n/10;
		}
		if (sum == prod) {
			System.err.println("Its a Spy Number");
		}
		else {
			System.err.println("Its not a Spy Number");
		}
		obj.close();
		
	}
}
