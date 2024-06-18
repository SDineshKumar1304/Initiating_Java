package Logics;
import java.util.Scanner;
public class Logics10 {
	
	static void isArmstrong(int n) {
		int digits = 0;
		 while (n>0) {
			 n= n/10;
			 int lastdigit = digits*10 + n%10;
			 digits++;
		 }
		 System.out.println(digits);
		 
		 int  armstrong = (int)Math.pow(n, digits);
		 if(n==armstrong) {
			 System.out.println("its Arm");
		 }
		 else {
			 System.out.println("not Arm");
		 }
	}
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		isArmstrong(n);
		obj.close();
	}
}
