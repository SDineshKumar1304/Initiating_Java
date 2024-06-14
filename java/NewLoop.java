package DineshNew;

public class NewLoop {
	public static void main(String[] args) {
		for(char ch = 'a';ch <= 'c'; ch++) {
			for (int i = 1;i<=3;i++) {
				System.out.print((char)(ch+i));
			}
			System.out.println();
			
		}
		
	}
}

//o/p
//bcd
//cde
//def