package Testjava.demo;

public class PostIncrementOperators {
	// Post Increment operator
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=a++;
		System.out.println("Updating  a : "+a);
		System.out.println("Using the initial a and stored to b : "+b);
	}
}

/* It is Unary  operator 
 * because accept one value at a time
 * it can be used only with a variable eg : 10++ results CTE
*/