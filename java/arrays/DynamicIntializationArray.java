package DineshNew;
import java.util.Scanner;
public class DynamicIntializationArray {
	public static void main(String[] args) {
		int a [] = new int[4];
		Scanner obj = new Scanner(System.in);
		int i;
		for (i = 0 ; i<a.length;i++) {
			
			System.out.print("Enter your "+ (i+1) +" element :");
			a[i] = obj.nextInt();
		}
		System.out.println("Elements Stored : "+"["+a[0]+","+a[1]+","+a[2]+","+a[3]+"]");
		obj.close();
	}
}
