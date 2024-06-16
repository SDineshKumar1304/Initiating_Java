package DineshNew;
import java.util.Scanner;
public class ReverseNumber {
	  static Scanner obj = new Scanner(System.in);
	  
	  public static void main(String[] args) {
		
		System.out.print("Enter the number : ");
		int num = obj.nextInt();
		
	    int a = 0;
	    while (num > 0) {
	      int ldigit = num % 10; // gives reminder 1234 % 10 = 4
	      a = a * 10 + ldigit; // a = 0*10 + 4 = 4 
	      System.out.println(a);
	      num = num / 10;//eliminates last number 1234/10 = 123
	      System.out.println(num);
	      
	      // While loop Do's Again and Again until  the num == 0
	    }	    
	    System.out.println("The reversed number is: " + a);

	  }
	}
