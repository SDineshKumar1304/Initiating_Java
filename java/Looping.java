package DineshNew;
import java.util.Scanner;
class Looping{
	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
		int a;
		System.out.print("Enter the value a : ");
		a=obj.nextInt();
		for (int i=1;i<=a;i++) 
		{ 
				System.out.print("*"+",");
		}
		System.out.println();
		for (int i=1;i<=a;i++) 
		{ 
				System.out.print("*"+",");
		}
		obj.close();
    }
}