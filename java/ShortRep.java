package Testjava.demo;
import java.util.Scanner;
public class ShortRep {
	public static void main(String []args) {
		Scanner obj=new Scanner(System.in);
		short value;
		System.out.print("Enter the number size ranges from -32768 to 32767 :");
		value = obj.nextShort();		//zero Satisfies both the positive and negative 
		/* total range is 65535 for short 
		 * 0 decides the value as positive  in a bit of final index
		 * 1 decides the value as negative in a bit of final index
		 * */
		System.out.println("The Short Representation :");// size ranges from -32768 to 32767
		System.err.println("No Error  when it is between Short ranges -32768 to 32767 : "+value);
		obj.close();
	}
}
