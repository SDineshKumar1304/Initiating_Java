package Testjava.demo;

class MethodsJava {
	static int amountDinesh = 100000;
	static int amountDhanush = 100000;
	public static void Dinesh() {
		String name1 = "Dinesh";
		
		System.out.println("Salary of "+name1+"   "+"is : "+amountDinesh);
	}
	public static void Dhanush() {
		String name2 = "Dhanush";
		System.out.println("Salary of "+name2 +" "+"is : "+amountDhanush);
	}
	public static void Total() {
		int total = amountDinesh +amountDhanush;
		System.out.println("Total Salary of them is : "+total);
	}
		
	public static  int  m1(){
		System.out.println("Hi");
		return 0;
		//System.out.println("Hello");
		}
		/* important : Return type  void is not mentioned ,
		we need to add return  0
		Also we can't add return 0 between the statements */ 
	
	
	public static int add(int a ,int b) {
		return a+b;
	}
	
	public static double newadd(double a ,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Dinesh();
		Dhanush();
		Total();
		m1();
		int res =add(2,3);
		System.out.println(res);
		double res1=(int)newadd(24.0,74);
		/*first converting to int in the right side 
		and converting to double*/
		int res2=(int)newadd(24.0,44);
		/*first converting to int in the right side 
		and converting to int*/
		char res3 = (char) res2;

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	 //	************main(new String[] {"A","B"});// Stack Overflow Error******************** 

	}
}
