import java.util.Scanner;
class Nestedif {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a ; int b; int c;
        System.out.println("Enter the number a:");   
        a = obj.nextInt();
        System.out.println("Enter the number b");
        b=obj.nextInt();
        System.out.println("Enter the number c ");
        c=obj.nextInt();
        if (a>b & a>c){
            System.out.println("a is Greater");
        }
        else if(b>c){
            System.out.println("b is Greater");
        }
        else{
            System.out.println("c is Greater");
        }
    obj.close();
    }
    
}
