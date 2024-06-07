package Testjava.demo;

public class TernaryNew {
	public static void main(String[] args) {
		int prawin=200;int naveen=100;
		/*int res = (prawin>naveen)? System.out.println(500) : naveen;
		 * we cant use System.out.println(500) because its not possible 
		 */ 
		int res = (prawin>naveen)? 500 : naveen;
		System.out.println(res);
		
	}
}
