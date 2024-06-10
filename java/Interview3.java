package Testjava.demo;

public class Interview3 {
	public static void main(String[] args) {
		byte a=10;
		byte b= 20;
		// byte c= a+b;
		//can't return byte it returns int		 
		byte c = a+b; //CTE
		//byte c = (byte) (a+b);
		System.out.println(c);
		System.out.println("hell0"+10+20);//left to right
		System.out.println(10+20+"Hell0");// left to  right
		//hell01020
		//30Hellp
		//System.out.println(true+false);//error
	}
}
