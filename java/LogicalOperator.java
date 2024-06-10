package Testjava.demo;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 10;
		String b="black";
		System.out.println(a==10 && b=="black");
		System.out.println(a==11 && b=="black");
        /*(&& Operator) checks both the thing matches or not ,if not returns false*/
		System.out.println(a==10 || b=="black"); 
		System.out.println(a==0 || b=="blue");
		System.out.println(a==10 || b=="blue");

		/*(|| operator ) checks if any one value matches, here both are matches returns true ,
		 * if both values not matches returns false*/ 
		System.out.println(!(a==1 && b=="blue"));
		System.out.println(!(a==10 && b=="black"));

		/*(! operator ,proves a and b values are not equal to the original value 
		 * if proven  returns true ,else false)*/
		
		//System.out.println(23 && 23); don't work without comparing 
		//System.out.println(a && b);
		//System.out.println(!(12+2)&&(12+2));//logical error
		System.out.println(!(10==10)&&(11==10));
		
	}

}
