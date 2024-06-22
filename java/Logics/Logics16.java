package Logics;
import java.util.Scanner;
public class Logics16 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n ;
		System.out.print("Enter the Number :");
		n = obj.nextInt();
		int a = n*n;
		System.out.println(a);
		int last = a%10;
		System.out.println(last);
		int first = 0;
		int b ;
	
		while(a>=10) {
			first = a/10; 
			System.out.println(first);
			a=first;
			
		}
		b = last+first;
		
		if (b==n) {
			System.out.println("Its a neon Number");
		}else if (n==0||n==1) {
			System.out.println("Its a neon Number");
		}else if(n>=10) {
			System.out.println("its not a neon number ,the number is out of range");
		}
	}
}
