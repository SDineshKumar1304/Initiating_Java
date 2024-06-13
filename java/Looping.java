package DineshNew;
import java.util.Scanner;
class Looping{
	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
		int a;
		System.out.print("Enter the value a : ");
		a=obj.nextInt();
		for (int i=1;i<=a;i++) // outer loop
		{ // i == j (m = n) (i = a,j = a)
			for (int j =1 ; j<=i;j++) // inner loop
			{
			System.out.print(" *");
			}
		System.out.println();
		}
		obj.close();
    }
}