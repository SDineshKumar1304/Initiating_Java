package DineshNew;


class BookNew{
	String Title;
	double Price;
}
public class Oops {
	public static void main(String[] args) {
		BookNew b =  new BookNew();
		BookNew b1 =  new BookNew();
		BookNew b2 =  new BookNew();
		
		b.Title = "Java";
		b1.Title = "English";
		b2.Title = "Tamil";
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b.Title);
		System.out.println(b1.Title);
		System.out.println(b2.Title);
		
	}
}
