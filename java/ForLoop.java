package Testjava.demo;
import java.util.Scanner;
class ForLoop{
	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
		int a;
		System.out.print("Enter the value a : ");
		a=obj.nextInt();
		for (int i=1;i<=a;i++) {
			for (int j=1;j<=a;j++) {
			System.out.print("*");
		}
		System.out.println();
		
		obj.close();}
}
}