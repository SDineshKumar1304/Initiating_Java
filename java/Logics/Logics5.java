package Logics;
public class Logics5 {
	public static void main(String[] args) {
		
		int sum =0;int avg =0;
		
		int a [] = {1,2,4,5,8};
		int l= a.length;
		System.out.println("length of an array : "+l);
		for (int i =0;i<l;i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of Digits in an array : "+sum);
		avg = sum/l;
		System.out.println("Average of numbers in an array : "+avg);
	}
}
