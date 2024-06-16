package Logics;
import java.util.Scanner;



//**********************Loop Patterns**************************//
//**********************Pattern Square************************//

public class Logic1 {
	
	
	void Square() {
		System.out.print("Enter the Number : ");
		int n = obj.nextInt();
		/* Square Pattern
		 * 
		 * Initially get the size n by declaring or dynamically getting input from the user
		 * Looping :

		 * n = 5
		 * Outer loop goes from 1 to n row wise : (System.out.println()) helps to go next line
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 
		 * step : 1 
		 * Outer loop i = 1
		 * i<=n true,goes Inner loop
		 * step : 2
		 * Inner Loop 
		 * j = 1 to n (n = 5)
		 * goes form 1 to 5 and print's * column wise :
		 *  (*****) based on n = 5 (System.out.print()) helps to print column wise
		 *  
		 *  Inner Loop gets Executed ,and (System.out.println()) helps to go next line `
		 *  i++ , i gets Incremented  and again Goes to Inner loop
		  
		 
		  Result and tracking loop
		  
		  Enter the Number : 5
		         
		         Inner Loop Working                          Outer Loop Working
		 
			 * j=1 * j=2 * j=3 * j=4 * j=5                      i :1
			
			 * j=1 * j=2 * j=3 * j=4 * j=5                      i :2
			
			 * j=1 * j=2 * j=3 * j=4 * j=5                      i :3
			
			 * j=1 * j=2 * j=3 * j=4 * j=5                      i :4
			
			 * j=1 * j=2 * j=3 * j=4 * j=5                      i :5
		
		 */
		
		for (int i = 1; i<=n;i++) {// outer Loop
			for(int j = 1 ; j<=n;j++) {// Inner loop 
				System.out.print(" * ");
				System.out.print("j="+j);
			}
			System.out.println(" i :" +i);
			
			System.out.println();
		}
		
	}
	
	
	//**********************Pattern Inverted Right Triangle************************//

	/* Inverted Right Triangle Pattern
	 * 
	 * Initially get the size n by declaring or dynamically getting input from the user
	 * Looping :
	 * 
	 * n = 5
	 * Outer loop goes from 1 to n row wise : (System.out.println()) helps to go next line
	 * 1
	 * 2
	 * 3
	 * 4
	 * 5
	 
	 * step : 1 
	 * Outer loop i = 1
	 * i<=n true,goes Inner loop
	 * step :2
	 * Inner Loop 
	 * j goes from i , i = 1 to n  and print's * column wise :

	 * example 
	 *  n = 5 
	 *  Outer loop i starts 1 to 5
	  
	 *  Inner loop starts 
	 *  j=i to n (1 to 5)  Logic is This !!!
	 *  first line 	 i = 1  
	 *  j start's Printing ( * ) from (1 to 5) = * * * * * 	
	    (System.out.print()) helps to print column wise
	    (System.out.println()) helps to go next line 

	 *  Second line i = 2
	 *  j start's Printing ( * ) from (2 to 5) = * * * * 
	 *  Third line  i = 3 
	 *  j start's Printing ( * ) from (3 to 5) = * * *
	 *  fourth line i = 4
	 *  j start's Printing ( * ) from ( 4 to 5) = * *
	 *  Fifth line i=5
	 *  j start's Printing ( * ) from (5 to 5) = * 

	 	Enter the Number : 5

	 
	      Inner Loop                                     Outer Loop
	    		
		 * j = 1 * j = 2 * j = 3 * j = 4 * j = 5             i:1    1 to 5
		
		 * j = 2 * j = 3 * j = 4 * j = 5                     i:2    2 to 5
		
		 * j = 3 * j = 4 * j = 5                             i:3    3 to 5
		
		 * j = 4 * j = 5                                     i:4    4 to 5
		 
		 * j = 5                                             i:5    5 to 5

	 */
	
	
	void InvertedRightTriangle() {
		System.out.print("Enter the Number : ");
		int n = obj.nextInt();
		
		for (int i = 1; i<=n;i++) {
			for(int j = i ; j<=n;j++) {
				System.out.print(" * ");
				System.out.print("j = "+j);
			}
			System.out.println(" i:"+i);
			System.out.println();
		}
		
	}
	 

	//**********************Pattern Left Triangle************************//

	/* Left Triangle  Pattern
	 * 
	 * Initially get the size n by declaring or dynamically getting input from the user
	 * Looping :
	 * 
	 * n = 5
	 * Outer loop goes from 1 to n row wise : (System.out.println()) helps to go next line
	 * 1
	 * 2
	 * 3
	 * 4
	 * 5
	 
	 * step : 1 
	 * Outer loop i = 1
	 * i<=n true,goes Inner loop
	 * step :2
	 * Inner Loop 
	 * j goes from i , i = 1 to n  and print's * column wise :

	 * example 
	 *  n = 5 
	 *  Outer loop i starts 1 to 5
	  
	 *  Inner loop starts 
	 *  j = 1 to i (1 to i(1 to 5 ))  Logic is This !!!
	 *  first line 	 i = 1  
	 *  j start's Printing ( * ) from (1) = *  	
	    (System.out.print()) helps to print column wise
	    (System.out.println()) helps to go next line 

	 *  Second line i = 2
	 *  j start's Printing ( * ) from (1 to 2) = * *  
	 *  Third line  i = 3 
	 *  j start's Printing ( * ) from (1 to 3) = * * *
	 *  fourth line i = 4
	 *  j start's Printing ( * ) from ( 1 to 4) = * * * *
	 *  Fifth line i=5
	 *  j start's Printing ( * ) from (1 to 5) = * * * * *
	 	Enter the Number : 5

	 
	      Inner Loop                                     Outer Loop
	   
		 * j = 1                                            i:1
		
		 * j = 1 * j = 2                                    i:2
		
		 * j = 1 * j = 2 * j = 3                            i:3
		
		 * j = 1 * j = 2 * j = 3 * j = 4                    i:4
		
		 * j = 1 * j = 2 * j = 3 * j = 4 * j = 5            i:5

	 */
	void LeftTriangle() {
		System.out.print("Enter the Number : ");
		int n = obj.nextInt();
		
		for (int i = 1; i<=n;i++) {
			for(int j = 1 ; j <= i ;j++) {
				System.out.print(" * ");
				System.out.print("j = "+j);
			}
			System.out.println(" i:"+i);
			System.out.println();
		}
		
	}
	
	
	
	//****************************Right Angle Triangle*********************************//
	
	void RightTriangle() {
		System.out.print("Enter the Number : ");
		int n = obj.nextInt();
		
		for (int i = 1; i<=n;i++) {
			for(int j = i ; j <= n ;j++) {
				System.out.print("  ");
			}
			for (int j = 1 ;j<=i ;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	//*********************Lower Pyramid*****************************//
	void LowerPyramid() {
		System.out.print("Enter the Number : ");
		int n = obj.nextInt();
		
		for (int i = 1; i<=n;i++) {
			for(int j = 1 ; j <= i ;j++) {
				System.out.print("  ");
			}
			for (int j = i ;j<n ;j++) {
				System.out.print("* ");
			}
			for (int j = i ;j<=n ;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
	
	//************************Upper Pyramid*********************************//
	void UpperPyramid() {
		System.out.print("Enter the Number : ");
		int n = obj.nextInt();
		
		for (int i = 1; i<n;i++) {
			for(int j = i ; j <=n ;j++) {
				System.out.print("  ");
			}
			for (int j = 1 ;j<i ;j++) {
				System.out.print("* ");
			}
			for (int j = 1 ;j<=i ;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for (int i = 1; i<=n;i++) {
			for(int j = 1 ; j <= i ;j++) {
				System.out.print("  ");
			}
			for (int j = i ;j<n ;j++) {
				System.out.print("* ");
			}
			for (int j = i ;j<=n ;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}
	
	//*****************************Diamond Pattern******************************//
	
	void Diamond() {
		System.out.print("Enter the Number : ");
		int n = obj.nextInt();
		
		for (int i = 1; i<=n;i++) {
			for(int j = i ; j <=n ;j++) {
				System.out.print("  ");
			}
			for (int j = 1 ;j<i ;j++) {
				System.out.print("* ");
			}
			for (int j = 1 ;j<=i ;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	
	static Scanner obj = new Scanner(System.in);
	public static void main(String[] args) {
		Logic1 a = new Logic1();
		a.Square();
		a.InvertedRightTriangle();
		a.LeftTriangle();
		a.RightTriangle();
		a.LowerPyramid();
		a.UpperPyramid();
	}
}



//Pro Tip : Increasing  (inner loop j = 1 to i) 
//          Decreasing  (inner loop j = i to n)

