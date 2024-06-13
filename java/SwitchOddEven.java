package DineshNew;
import java.util.Scanner;
public class SwitchOddEven {
 static Scanner obj = new Scanner(System.in);
  public static void main(String[] args) {
	System.out.print("Enter your Number : ");
	int num = obj.nextInt();
//	switch (num%2) // If we Enter  the negative odd number reminder is -1 but it is not in the case
	switch (Math.abs(num%2)) // Math Library  contains abs which gives absoulute values converts -1 to +1
	{
	case 0:
		System.out.println("Your Number is Even ");
		break; // We need to use Break Statements to break the case , because if we dont use it will return all cases 
	case 1:
		System.out.println("Your Number is Odd ");
		break;
	
	default:
		System.out.println("No Number is Entered !!! ");
		
	}
 }
}
