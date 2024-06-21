package DineshNew;

//creating object from one class to another class

class  Book{
	
}

public class Oops1 {
	public static void main(String[] args) {
		new Book();
		System.out.println(new Book()); // returns the logical reference of the book object
		System.out.println(new Book()); // we can create n number of objects
		System.out.println(new Book());
		System.out.println(new Book());
		System.out.println(new Book());
		System.out.println(new Book());
		System.out.println(new Book());// address will change for same object
	}
}