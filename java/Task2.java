package DineshNew;
import java.util.Scanner;
public class Task2 {
	static Scanner obj = new Scanner(System.in);
	
	//******************Basic Square Pattern******************************
	
	 public static void SquarePattern() {
		 Scanner obj = new Scanner(System.in);
			int a;
			System.out.print("Enter the value a : ");
			a=obj.nextInt();
			for (int i=1;i<=a;i++) {
				for (int j=1;j<=a;j++){
					
					 System.out.print((i==1||j==a||j==1||i==a) ? "* ":"  ");
//					if (i==1||j==a||j==1||i==a) {
//						{
//							System.out.print("* ");
//						}
//					}
//					else {
//						System.out.print("  ");
//					}
				}
				
			System.out.println();
	 }
}
	
	
	
    //*************************Inverted Upper Right Triangle *********************************

    public static void UpperTrianglePattern()
    {
    	int a;
		// Printing the message for User Understandings
    	
	    System.out.print("Enter your Number :");
	    a = obj.nextInt();// input is Stored
	   
	    for (int i = a; i >= 1; i--) // outer loop  i=a decrement from user input
	    {
	      for (int j = 1; j <= i; j++) // initializing j = 1   if a= 5 = i  so from j starts from  1 and includes 5
	      {
	        if (i == a || j == 1 || j == i )// Checking condition  for deciding to print * or " "
	        	// if any one Condition Satisfies print's "* "
	        	
	        { 
	          System.out.print("* ");
	        } 
	        else
	        {
	          System.out.print("  ");
	        }
	      }
	      System.out.println();// Moves to the next line after each row
       }

	 }
    
   
    //*************************Diagonal Pattern (Left to Right wise Printing)*********************************

    
    public static void DiagonalPattern() {
    	int n ; 
    	System.out.print("Enter your Number : ");
    	n = obj.nextInt();
    	for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n; j++) {
            if (i == j) { // if diagonal (i = j)
              System.out.print("*"); // print's "*"
            } else {
              System.out.print(" ");
            }
          }
          System.out.println();
    }
 }
      //*************************Diagonal Pattern (Right to Left wise Printing)*********************************
    
    public static void DiagonalPatternRL() {
    	int n ; 
    	System.out.print("Enter your Number : ");
    	n = obj.nextInt();
    	for (int i = 0; i <= n; i++) {
          for (int j = 1 ; j <= n; j++) {
            if (j == n - i) { // diagonal ( j == n - i) Right to Left
              System.out.print("*   "); // if satisfies print's "*  "
            } else {
              System.out.print("  ");
            }
          }
          System.out.println();
       }
    }    
    // ***************************Main Method********************************
    
	public static void main(String[] args) {
	    // *******************Calling Static Methods*******************************
		UpperTrianglePattern();
	    DiagonalPattern();
	    DiagonalPatternRL();
	    SquarePattern();
	    }
	}
