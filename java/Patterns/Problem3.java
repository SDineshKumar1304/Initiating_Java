import java.util.Scanner;

public class Problem3 {
    static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = obj.nextInt();

        /*****************************Pattern Right Triangle************************************/

        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
