// String is a non primitive datatype
		// Operators +,-,/,%,*
		/*
		 * + performs addition and concatenation
		 * example for addition : 2+3 =5
		 * example for concatenation : "Dinesh" + " " + "Kumar" = Dinesh Kumar
		 * - performs Subraction
		 * example for Subraction : 3-2 = 1
		 * * performs multiplication
		 * example for multiplication : 2*3 = 6
		 * / performs Division  : 1234/10 = 123 , eliminats the last number 
		 * example for division : 12/2 = 6
		 * % it is used to get the reminder from the number
		 * example for modulus: 12345 % 10 = 1234 
		 * */

package Testjava.demo;
import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a;
		String b;
		int c;
		System.out.print("Enter the Number : ");
		a=obj.nextInt();
		System.out.print("Enter the string b to  perform concatenation with a  : ");
		b=obj.next();
		System.out.print("Enter the Second Number c : ");
		c=obj.nextInt();
		
		System.out.println("Sample Integer String concatenation :"+(2+" Dinesh"));
		// we can also add integer and a string also because it comes under concatenation !!!

		System.out.println("Sample Integer Character concatenation :"+(2+'D'));
		// Output : Sample Integer Character concatenation :70 Returns Ascii Values !!
		
		System.out.println("Boolean and String Concatenation : "+("430"+true));
		// Output : Sample Boolean String concatenation : 430true !!

		// System.out.println("Boolean and Character Concatenation : "+('4'+true));
		// can't concatenate Boolean and the Character !!!

		
		System.out.println("Additon Operator : "+(a+b));
		System.out.println("Subraction Operator : "+(a-c));
		System.out.println("Multiplication Operator : "+(a*c));
		System.out.println("Division Operator : "+(a/c));
		System.out.println("Modulo Operator : "+(a%c));	
		obj.close();
		
	}
}
