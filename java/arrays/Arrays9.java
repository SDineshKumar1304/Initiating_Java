package DineshNew;

public class Arrays9 {
	
	static int[] New() {
		System.out.println("Hello");
		int a [] = {1,2,3,4,5,6,7};
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) {
		int a[] = New();
		
		System.out.println(a[0]);
		System.out.println(New()[0]);// We can also Access because we returning the reference


	}
}
