package Logics;

public class Logics7 {
	 public static void main(String[] args) {
		int n = 10;
		int a = 0 ;
		int b = 1;
		int nextnum;
		for(int i = 1 ;i <=n;i++) {
			nextnum = a+b;
			a = b;
			b = nextnum;
			System.out.print(a+",");
		}
		
	}
}
