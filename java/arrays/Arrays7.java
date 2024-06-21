package DineshNew;

public class Arrays7 {
	public static void main(String[] args) {
		int a[] = {12,45,67};
		System.out.println("From Main : "+a[0]);
		New(a);// Using reference we can access the index element
	}
	
	static void New(int a[]) {
		System.out.println("From New Method :"+a[1]);// index of first element
	} 
}
