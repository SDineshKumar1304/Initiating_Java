package Logics;

public class Logics6 {
	public static void main(String[] args) {
		String a = "DK";
		String res = "";
		char ch;
		for (int i =0 ; i < a.length();i++) {//i for String initial index is 0
			ch = a.charAt(i);
			res  =ch+ res ;
		}
		System.out.println(res);
	}
}
