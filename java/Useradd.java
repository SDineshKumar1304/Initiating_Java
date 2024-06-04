import java.util.Scanner;
class Useradd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a; int b; int c;
        System.out.println("Enter the first Number : ");
        a=obj.nextInt();
        System.out.println("Enter the Second Number :");
        b=obj.nextInt();
        c=a+b;
        System.out.println("Addition of Two numbers :"+c);
        obj.close();
    }
        
}
