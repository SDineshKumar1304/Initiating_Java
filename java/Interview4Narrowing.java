package Testjava.demo;

public class Interview4Narrowing {
   public static void main(String[] args) {
	double a= 20.4;
	int b;
	b = (int)a;// data loss 
	//implicit not possible
	System.out.println(b);
}
}
