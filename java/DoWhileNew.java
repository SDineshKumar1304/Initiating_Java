package DineshNew;

public class DoWhileNew {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		do {
			if (i%2==0) {
				System.out.print(i+", ");
				
			}
			i++;
		}
		while(i<=j);
		System.out.println("Thank You");
	}
}
