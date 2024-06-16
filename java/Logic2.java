package Logics;
import java.util.Scanner;
//***********************Hollow Patterns*******************************//



public class Logic2 {
	
	static Scanner obj = new Scanner(System.in);
	
	void Square1(){
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		for (int i = 1 ; i<=n;i++) {
			for (int j = 1 ; j<=n ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void SquareHollowFL(){
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		for (int i = 1 ; i<=n;i++) {
			for (int j = 1 ; j<=n ;j++) {
				if (j==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	void SquareHollow(){
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		for (int i = 1 ; i<=n;i++) {
			for (int j = 1 ; j<=n ;j++) {
				if (j==1||j==n||i==1||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	void LeftDiagonal(){
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		for (int i = 1 ; i<=n;i++) {
			for (int j = 1 ; j<=n ;j++) {
				if (j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	void Plus(){
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		for (int i = 1 ; i<=n;i++) {
			for (int j = 1 ; j<=n ;j++) {
				if (j==n/2+1||i == n/2+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	void Cross(){
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		for (int i = 1 ; i<=n;i++) {
			for (int j = 1 ; j<=n ;j++) {
				if (i+j==n+1||i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	void RightTriangleHollow(){
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		for (int i = 1 ; i<=n;i++) {
			for (int j = 1 ; j<=n ;j++) {
				if (i==n||j==i||j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	void UpperRightTriangleHollow(){
		System.out.print("Enter your Number : ");
		int n = obj.nextInt();
		for (int i = 1 ; i<=n;i++) {
			for (int j = i ; j<=n ;j++) {
				if (i+j==n+1||i==1||j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Logic2 a = new Logic2();
		a.Square1();
		a.SquareHollowFL();
		a.SquareHollow();
		a.LeftDiagonal();
		a.Plus();
		a.Cross();
		a.RightTriangleHollow();
		a.UpperRightTriangleHollow();
	}
}
