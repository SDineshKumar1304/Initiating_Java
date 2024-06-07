package Testjava.demo;

public class CompoundAssignmentOperator {
	public static void main(String[] args) {
		int wallet = 500;
		// if we do like this wallet = 300 ,200 will be loss 
		// the correct way  is the below
		wallet += 300;
		 System.out.println("Updated amount : "+wallet);
	}
}
