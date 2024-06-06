package Testjava.demo;
import java.util.Scanner;
public class MyBio {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = obj.next() ;
		
		System.out.println("Enter your Roll number : ");
		String roll = obj.next();
		
		System.out.println("Enter your address : ");
		String address =obj.next() ;
		
		System.out.println("Enter your age : ");
		int age = obj.nextInt();
		
		System.out.println("Enter your Mobile Number : ");
		long mobile = obj.nextLong();
		
		System.out.println("Enter your Blood Group : ");
		String blood = obj.next();
		
		System.err.println("Name : "+name);
		System.err.println("Roll Number : "+roll);
		System.err.println("Address : "+address);
		System.err.println("age : "+age);
		System.err.println("mobile number : "+mobile);
		System.err.println("Blood Group : "+blood);
		obj.close();
	
	}

}
