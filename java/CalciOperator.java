package Testjava.demo;
import java.util.Scanner;
public class CalciOperator
 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int user;int a;int b;
        System.out.println("Your Option are 1,2,3 ");
        System.out.println("Option 1 = Addtion");
        System.out.println("Option 2 = Subraction");
        System.out.println("Option 3 = Multiplication");
        System.out.print("Enter your option : ");
        user=obj.nextInt();
        if(user==1){
            int addition;
            System.out.print("Enter your first number : ");
            a=obj.nextInt();
            System.out.print("Enter your Second Number :");
            b=obj.nextInt();
            addition=a+b;
            System.out.print("Addtion of the numbers :"+addition);
        }
        else if (user==2){
            int subraction;
            System.out.println("Enter your first number : ");
            a=obj.nextInt();
            System.out.println("Enter your Second Number :");
            b=obj.nextInt();
            subraction=a-b;
            System.out.println("Subraction of the numbers :"+subraction);
        }
        else if (user==3){
            int multiplication;
            System.out.print("Enter your first number : ");
            a=obj.nextInt();
            System.out.print("Enter your Second Number :");
            b=obj.nextInt();
            multiplication=a*b;
            System.out.print("Multiplication of the numbers : "+multiplication);

        }
        else{
            System.err.print("Calci Operation error");
        }
            obj.close();

    }
}
