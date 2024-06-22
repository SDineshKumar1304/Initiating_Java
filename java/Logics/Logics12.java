package Logics;
import java.util.Scanner;
public class Logics12 {
	public static Scanner obj=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int num=obj.nextInt();
		int max=40,n=0,i=0,k=0,t,j,h,sum;
		if(num<=max && num>=0) {
			n=num/5;
			num=num%5;
			if(n>5) {
				t=n-5;
				num=num+(t*5);
				n=5;
			}
			i=num/2;
			num=num%2;
			if(i>5) {
				j=i-5;
				num=num+(j*2);
				i=5;
			}
			k=num/1;
			num=num%1;
			if(k>5) {
				h=k-5;
				num=num+(h*1);
				k=5;
			}
			sum=i+k+n;
			System.out.println("number of 5 rupees is : "+n);
			System.out.println("number of 2 rupees is : "+i);
			System.out.println("number of 1 rupees is : "+k);
			System.out.println("the total sum is : "+sum);
		}
		else if(num<0)
			System.out.println("you entered a negative number.");
		else
			System.out.println("the value is exceeding the limit.");
		obj.close();

	}

}