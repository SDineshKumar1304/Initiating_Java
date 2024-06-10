package Testjava.demo;

import java.util.Scanner;

public class MethodsNew {
	// Interview !!!
	// Can't provide the print statement outside the main block
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);  // Creating Scanner object once outside methods

        System.out.print("Enter the salary of the first person: ");
        int amountDinesh = obj.nextInt();   // Storing the salary of first person

        System.out.print("Enter the name of the first person: ");
        String name1 = obj.next(); // storing the name of the first person

        System.out.print("Enter the salary of the second person: ");
        int amountDhanush = obj.nextInt();  // Storing the Salary of the Second Person

        System.out.print("Enter the name of the second person: ");
        String name2 = obj.next(); // Storing the name of the Second person

        displaySalary(name1, amountDinesh);
        displaySalary(name2, amountDhanush);
        calculateTotal(amountDinesh, amountDhanush);
        int result = add(2, 3);
        System.out.println("Sum of 2 and 3: " + result);

        // Type casting
        double result1 = newadd(24.0, 74); // No conversion needed for double + int
        System.out.println("24.0 + 74: " + result1);

        int result2 = (int) newadd(24.0, 44); // Explicit conversion to int (truncation)
        System.out.println("24.0 (int) + 44: " + result2);

        char result3 = (char) result2; // Further conversion to char (may lose precision)
        System.out.println("Integer value as char (may be unexpected in this Ascii value ): " + result3);
        obj.close();

    }

    public static void displaySalary(String name, int amount) {
        System.out.println("Salary of " + name + " is: " + amount);
    }

    public static void calculateTotal(int amount1, int amount2) {
        int total = amount1 + amount2;
        System.err.println("Total salary: " + total);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double newadd(double a, int b) {
        return a + b; // No conversion needed for double + int
    }

     // Interview Question we can do  the below type 
	
 	 //	method inside the main ************main(new String[] {"A","B"});// Stack Overflow Error******************** 
        
    }
