package Dinesh.java;

//******************Using the Non static method from the previous Class*********************//
// previous class has Non Static Methods we are utilizing those methods here!!!


public class UsingNonStaticMethod {
   public static void main(String[] args) {
	NonStaticMethodMember c = new NonStaticMethodMember();// Object is created 'c'
	c.Dinesh();// Utilzing the Dinesh method from the Previous class 
	System.out.println("Addition of Two Numbers : "+c.Add(2, 0));// Utilizing the Add method from the previous class
	
  }
}