import java.util.Scanner;

public class Problem2 {
    static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = obj.nextInt();

        /*****************************Pattern Decreasing Triangle************************************/

        for(int i = 1 ; i <= n ; i++){
            for (int j = i ;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
