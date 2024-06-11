package DineshusingNonStatic;

import Dinesh.java.NonStaticMethodMember;

public class UsingNonStatic {
 public static void main(String[] args) {
	NonStaticMethodMember c= new NonStaticMethodMember();
	System.out.println("The Addition of two Number : "+c.Add(2, 3));
	c.Dinesh();
}
}
