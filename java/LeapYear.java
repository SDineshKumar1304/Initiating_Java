package DineshNew;
import java.util.Scanner;
public class LeapYear {
   static Scanner obj = new Scanner(System.in);
   
   //*********************Using if - else*****************************//
   static void Year() {
	   int year ;
	   System.out.print("Enter your year to check whether the year is leap year or not (Using if - else) :");
	   year = obj.nextInt();
	   if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
		   System.err.println("This is a Leap year");		   
	   }
	   else {
		   System.err.println("Not a Leap year");		   
	   }
   }
	  //*************************Using Ternary Operators************************// 
	   	public static void NewLeap() {
	   		System.out.print("Enter the year to check whether the year is leap year or not (Using Ternary operators): ");
	   		int year=obj.nextInt();
	   		String res=(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))? "This is the leap year": "This is not the leap year";
	   		System.err.print(res);
	   		}

	   	public static void main(String [] args) {
	 	   Year();
	 	   NewLeap();
	    }
   }

