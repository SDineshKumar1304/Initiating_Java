package Logics;
import java.util.Scanner;
public class Logics4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		int sum = 0;
		int lastDigit;
		while(n>0) {
			lastDigit =n%10;
			sum = sum+lastDigit;
			n=n/10;
		}
		System.out.println("The sum of all digits in a Number is : "+sum);
		obj.close();
	}
}
