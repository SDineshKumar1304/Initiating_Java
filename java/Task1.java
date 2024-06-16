package DineshNew;

public class Task1 {
	
	static void NumberToChar() {
		for (int i=97;i<123;i++) {
			if(i==122) {
				System.out.print((char)i+".");
			}
			else
				System.out.print((char)i+",");
		}
	}
	static void AlphaReverse() {
		for (int i=122;i>96;i--) {
			if(i==97) {
				System.out.print((char)i+".");
			}
			else
				System.out.print((char)i+",");
		}
	}

	static void Alphabets_reverse() {
		for (int i=90;i>64;i--) {
			if(i==65) {
				System.out.print((char)i+".");
			}
			else
				System.out.print((char)i+",");
		}
		}
	  public static void Reverse() {
		  for (int i = 10;i>=0;i--) {
				System.out.print(i+",");
			}
	  }
	   public static void UppertoLowerAscii() {
		   for (char i = 65 ; i <=90;i++) {
			   System.out.print((char)(i+32));
		   }
	   }
	   public static void LowerToAscii() {
		   for (char i = 97 ; i <=122;i++) {
			   System.out.print((char)(i-32));
		   }
	   }
	  
	  
	public static void main(String[] args) {
		System.err.print("Reversed Numbers from 0 to 10 : ");
		Reverse();
		System.out.println();
		
		System.err.print("Lower case Alphabet Reverse : ");
		AlphaReverse();
		System.out.println();
		
		System.err.print("Upper Case Alphaber Reverse : ");
		Alphabets_reverse();
		System.out.println();
		
		System.err.print("Number to char conversion : ");
		NumberToChar();
		System.out.println();
		
		System.err.print("Upper to Lower Case Conversion : ");
		UppertoLowerAscii();
		System.out.println();
		
		System.err.print("Lower to Ascii Conversion : ");
		LowerToAscii();
		System.out.println((char)35);

		
	}	
}

