package DineshNew;

public class Arrays8 {
	public static void main(String[] args) {
		int a [] = {1,2,4,5,6,7};
		int b [] = {2,2,4,4,5,5};
		New(a);
		System.out.println();
		New(b);
	}
	
	static void New(int a[]) {
		for (int i = 0 ; i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
}
