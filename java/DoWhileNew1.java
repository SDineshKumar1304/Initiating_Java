package DineshNew;
import java.util.Scanner;
class DoWhileNew1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		char a;
		do {
			System.out.println("Welcome"); 
			System.out.println("Do you  want me to print again?");
			System.out.print("Type y for yes , Type n for no : ");
			a = obj.next().charAt(0);
		}
		while(a=='y');
		System.exit(15);/// Its helps us to  terminate main loop inside inside the main method
		main(new String[] {"A","B"});
		obj.close();

	}
}
