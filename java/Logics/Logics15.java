package Logics;
import java.util.Scanner;

public class Logics15 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int n = obj.nextInt();
    
    // Convert the number to a string to easily access its digits
    String numStr = Integer.toString(n);
    int length = numStr.length();
    
    // If the number has less than 3 digits, it can't be classified as Xylem or Phloem
    if (length < 3) {
      System.out.println("Number should have at least three digits to classify as Xylem or Phloem");
      obj.close();
      return;
    }
    
    int first = Character.getNumericValue(numStr.charAt(0));
    int last = Character.getNumericValue(numStr.charAt(length - 1));
    int OuterDigitsSum = first + last;
    
    int InnerDigitsSum = 0;
    for (int i = 1; i < length - 1; i++) {
      InnerDigitsSum += Character.getNumericValue(numStr.charAt(i));
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
