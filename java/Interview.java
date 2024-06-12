package DineshNew;
import java.util.Scanner;

//********************** Interview **************************// 
public class Interview {
	static Scanner obj = new Scanner(System.in);
	
	
	//*********************Byte Increment and Decrement*************************//
	public static void main(String[] args) {
		byte a = 127;
//		long c =(a>127)?(long)a:a;
		byte b=++a;
//		System.out.println(c);

		System.out.println("b value : "+b);	
		
//		System.out.println((a>127)?(long)a:a);
		System.out.println("Incremented Value in Byte a :"+a);
		System.out.println("Incremented Value in Byte a :"+a++);
		//Here a becomes -127
		System.out.println("Both (Post) Increment and Decrement Value for Byte : "+"Post Incremented Value "+ a++ +" , " +"Post Decremented Value " + a--);
		System.out.println("Finally a Value is : "+a);
		TypeCast();
	}
	
	//****************************Byte TypeCasting********************************//
	public static void TypeCast() {
		System.out.print("Enter the double Value :");
		double a=obj.nextDouble();
		byte b = (byte)a;
		System.out.println("Converted Byte Value from Double : "+b);
	}

}
