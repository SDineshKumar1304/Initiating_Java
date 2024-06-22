package Logics;
import java.util.*;

public class Logics14 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int n = obj.nextInt();
    
    int temp = n;
    int first = 0;
    int last = 0;
    int OuterDigitsSum = 0;
    int InnerDigitsSum = 0;
    
    // Find the last digit
    last = temp % 10;
    
    // Find the first digit
    while (temp >= 10) {
      temp = temp/10; // 1234/10 = 123, 123/10 = 12 ,12/10 = 1
    }
    first = temp;
    
    // Calculate OuterDigitsSum
    OuterDigitsSum = first + last;
    
    // Reset temp to original number to find inner digits sum
    temp = n / 10; // Remove the last digit  1234 / 10 =123
    System.out.println("Check:"+temp);
    
    // Calculate InnerDigitsSum
    while (temp >= 10) {
      int innerDigit = temp % 10; // 123 %10 =3,12%10 = 2
      InnerDigitsSum = InnerDigitsSum + innerDigit; // 0 +3=3,3+2 =5
      temp = temp/ 10; // 123/10 =12,1/10 fails
    }
    
    System.out.println("Outer digits are added: " + OuterDigitsSum);
    System.out.println("Inner digits are added: " + InnerDigitsSum);
    
    if (OuterDigitsSum == InnerDigitsSum) {
      System.out.println("It's a Xylem number");
    } else {
      System.out.println("It's a Phloem number");
    }
    
    obj.close();
  }
}
