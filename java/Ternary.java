package Testjava.demo;

public class Ternary {
	public static void main(String[] args) {
		int a=100;
		int nobita=10;
		int res1,res2,res3;
		res1 = (a>nobita)? a:nobita;
		res2 = (a<nobita)? a:nobita;
		res3 = (a==nobita)? nobita:a;
		boolean res4 = (a>=nobita)? true:false;
		boolean res5 = (a!=nobita)? true:false;
		/*Here we are using more than 2 operators so  it is (ternary)
		 * if the contion satisfies returns integer values a ,
		 * if conditon fails returns nobita  
		 */ 
		// 
		
		
	//	int res6 = (10+10+12==(10+10+12)? ((10+11==10+11)? 10:11):6);
		/*
		 * first  checks (10+10+12)!=(10+10+12) if it false returns 6
		 * if (10+10+12)==(10+10+12) if it is and checks (10+11!=10+11 true directly return 10
		 * if (10+10+12)==(10+10+12) true and checks (10+11!=10+11) false returns 11
		 * 
		 */

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		//System.out.println(res6);
		
	}
}
