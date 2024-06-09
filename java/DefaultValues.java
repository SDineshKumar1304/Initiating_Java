package Testjava.demo;
class DefaultValues{
	static int a;
	static long b;
	static byte c;
	static short d;
	static float e;
	static double f;
	static char g;
	static boolean h;

	// mention  static outside the main block to get the default values of the datatypes 
	public static void main(String []args) {
		// main block  is already  in  static
		System.err.println(a);
		System.err.println(b);
		System.err.println(c);
		System.err.println(d);
		System.err.println(e);
		System.err.println(f);
		System.err.println(g);
		System.err.println(h);
		
		
	}
}
