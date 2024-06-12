package DineshNew;
import java.util.Scanner;
public class InputBufferNext {
  public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	
//***********Using next ()**************//
//	Dinesh Kumar
//	Dinesh  
	String a = obj.next();
	System.out.println(a);
	
	obj.nextLine();//Clearing the Buffer memory Kumar in the input file
	
	a= obj.nextLine();
	System.out.println(a);
	
	double b= obj.nextDouble();
	System.out.println(b);
	
	
	String c = obj.nextLine();
	System.out.println(c);
	

//***** Using next line()************//
//	Dinesh Kumar
//	Dinesh Kumar
	obj.close();
}
}
