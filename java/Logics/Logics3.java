package Logics;
import java.util.Scanner;
public class Logics3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your range of Count : ");
		int count  = obj.nextInt();
		int tot = 0;int avg=0;
		for (int i =1 ; i<=count;i++) {
			System.out.print("The Number "+i+" is : ");
			int a =obj.nextInt();
			tot = tot+a;
		}
		System.out.println("Sum of all numbers is : "+tot);
		avg = tot/count;
		System.out.println("Average of all numbers is : "+avg);
		
		obj.close();
	}
}
