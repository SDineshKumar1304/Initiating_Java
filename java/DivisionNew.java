package Testjava.demo;

public class DivisionNew {

	public static void main(String[] args) {
		System.out.println(2/6);
		System.out.println('a'/2);
		System.out.println('a'/'a');
		System.out.println(0.0/0.0);
		System.err.println(1.0/0.0);
		// System.out.println("dj"/7); compilation error
		// System.out.println(true/true); compilation error
		System.out.println(30/0);
		/* Exception in thread "main" java.lang.ArithmeticException: / by zero
		at Test/Testjava.demo.Division.main(Division.java:11)*/
		// Arithmetic Exception is due to class name 🙄

	}

}
