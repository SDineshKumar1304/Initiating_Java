package DineshNew;

class NewBook{
	String title;
	double Price;
}

public class Oops7 {
	public static void main(String[] args) {
		NewBook b1 = new NewBook();
		NewBook b2 = new NewBook();
		NewBook b3 = new NewBook();
		
		// Book 1
		b1.title = "Java";
		b1.Price = 1000.0d;
		
		// Book 2
		b2.title = "Oops";
		b2.Price = 1000.0d;
		
		// Book 3
		b3.title = "Tamil";
		b3.Price = 1000.0d;
		
		System.out.println(b1.title);
		System.out.println(b1.Price);
		
		System.out.println(b2.title);
		System.out.println(b2.Price);
		
	}
}
