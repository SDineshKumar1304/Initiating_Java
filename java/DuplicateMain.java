package Testjava.demo;

public class DuplicateMain {
	public static void main (String[] args) {
		System.out.println("Hi");
	}
	public static void main (String[] args) {
		System.out.println("Hi");
	}
/* compiler compiles this code  but it will return the output and returntype of the output , 
 * JVM only  focus on the main method ,ignores the duplicates and shows the output 
 * Interiview :  😯 Its an error "Duplicate method main(String[]) in type DuplicateMain"
*/
}
