package DineshNew;

//***********************Compile Time Binding***************************

// The Process of Binding the Method call Statement with a method 
//Definition at the compile time by the compiler by analysing actual and formal arguments

public class CompileTimeBinding {
	public static int Bind(int a) {
		System.out.println(a);
		return a;
	}
	public static double Bind(double b) {
		System.out.println(b);
		return b;
	}
	public static char Bind(char c) {
		System.out.println(c);
		return c;
	}
	
	public static void main(String[]args) {
		//****************Compile Time Binding is Done*******************
		
		
		/* Note : We cant call the non static method inside the main method
		without creatig the objects
		we need to create the objects  */  
		
//		int res;
//		CompileTimeBinding obj = new CompileTimeBinding();
//		res = obj.Bind(10);
		
		Bind(19);
		Bind(1.3);
		Bind('s');
		Bind(10f);// implicit typecasting (Widening)
	}
}
