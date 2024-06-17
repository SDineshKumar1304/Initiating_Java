package Logics;
import java.util.Scanner;
public class Logics8 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = obj.nextInt();
		System.out.println("Factorial of a Number : "+ Fact(n));
		obj.close();

	}
	
	static int Fact(int n) {
		if (n==1) {
			return 1;
		}
		else {
			n = n*Fact(n-1);
			return n;
		}
	}
}
