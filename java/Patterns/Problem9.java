import java.util.Scanner;

public class Problem9{
    static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = obj.nextInt();

        /*****************************Pattern Hollow Square************************************/

        for(int i = 1 ; i <= n ; i++){
            for (int j = 1;j<=n;j++){
                if(i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
