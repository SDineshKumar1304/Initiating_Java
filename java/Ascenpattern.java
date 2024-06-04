import java.util.Scanner;
public class Ascenpattern{
    public static void main(String [] args){
    int a;
    Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number :");
        a =obj.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){// continue with the first loop for ascenpattern to get ascending order
                System.out.print('*');
            }
            System.out.println();
        }
    obj.close();
    }
}