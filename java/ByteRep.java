package Testjava.demo;
import java.util.Scanner;
public class ByteRep {
	public static void main(String []args) {
		Scanner obj=new Scanner(System.in);
		byte value;
		System.out.print("Enter the number size ranges from -128 to 127 :");
		value =obj.nextByte();//zero Satisfies both the positive and negative 
		/* total range is 255 for byte
		 * 0 decides the value as positive  in a bit of final index
		 * 1 decides the value as negative in a bit of final index
		 * */
		System.out.println("The Byte Representation :");// size ranges from -128 to 127
		System.err.println("No Error  when it is between byte ranges -128 to 127 : "+value);
		obj.close();
	}
}
