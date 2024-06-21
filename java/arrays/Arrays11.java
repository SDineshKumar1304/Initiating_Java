package DineshNew;
import java.util.Scanner;
public class Arrays11 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int  n;
		System.out.print("Enter your length of the array :");
		n  = obj.nextInt();
		int a [] = new int[n];
		int x = n;
		for (int i = 1 ; i<=n;i++) {
			System.out.print(i*i+",");
		}
		obj.close();
	}
}
