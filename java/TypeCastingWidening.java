package Testjava.demo;

public class TypeCastingWidening {
	public static void main(String[] args) {
		int a=10;
		double b;
		b=a;// typecasting is done (Widening because no  data loss) 
		System.out.println(a);
		System.out.println(b);
		
	}
}
