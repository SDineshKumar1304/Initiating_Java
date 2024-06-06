package Testjava.demo;

public class UserdefinedMethod {
	public static void main(String[] args)
	/*
	 * Predefined main Method in Java JVM only understand this !!!
	 * */
	{
		Main(); // Calling the User Defined Function
		System.out.println("Hi");
	}
	public static void Main() 
	/*
	 * Its a User Defined method!!!
	 * */
	{
		System.out.println("hello");
	}
}
