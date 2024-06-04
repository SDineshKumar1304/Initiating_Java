import java.util.Scanner;
class If {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a ; int b; 
        System.out.println("Enter the number a :");
        a=obj.nextInt();
        System.out.println("Enter the number b");
        b = obj.nextInt();
        if (a>b){
            System.out.println("a is Greater");
        }
        else{
            System.out.println("b is Greater");
        }
    obj.close();
    }    
}
