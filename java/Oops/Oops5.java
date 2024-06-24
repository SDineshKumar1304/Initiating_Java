package DineshNew;

// one object is created with different variables
class Book{
	
}

public class Oops5 {
		public static void main(String[] args) {
			Book a = new Book();
			Book b = a;
			Book c = b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			System.out.println(a==b);
			System.out.println(a!=b);
			System.out.println(a==c);
			System.out.println(c==a);
		}
}
