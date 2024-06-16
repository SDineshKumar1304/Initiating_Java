package DineshNew;
import java.util.Scanner;
public class ReverseFor {
   static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        int a = 0;
        System.out.print("Enter the number : ");
		int num = obj.nextInt();
        System.out.println("The original number is: " + num);

		
        for ( int i =num ; num != 0;num = num/ 10) {
            int lastDigit = num % 10;
            a = a * 10 + lastDigit;   
        }
        System.out.println("The reversed number is: " + a);
       obj.close();
    }

}