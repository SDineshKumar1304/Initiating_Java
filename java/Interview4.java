package DineshNew;

public class Interview4 {
	public static void main(String[] args) {
		System.out.println("START");
		int b=9;
		Interview4 obj = new Interview4();
		
		b=obj.demo(b);
		System.out.println(b);
		System.out.println("STOP");
	}
	
	int demo(int a) {
		System.out.println(a++);
		return a++;
		
	}
}
