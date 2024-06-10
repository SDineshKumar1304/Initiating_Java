package Testjava.demo;
import java.util.Scanner;

public class CubeNumber {

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter a number: ");
    double number = obj.nextDouble();
    
    // Calculating the cube of the number
    double cube = number * number * number;
    
    // TypeCasting (Narrowing)
    
    int res = (int)cube;
    
    System.out.println("The cube of " + number + " is: " + res);
    obj.close();
    
    Cube(6.0);
    
  }
  
  public static void Cube(double a){
	  char cube = (char) (a * a * a);
	  System.out.println("Character Value : "+cube);

  }
}
