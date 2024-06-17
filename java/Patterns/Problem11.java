import java.util.Scanner;

public class Problem11{
    static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = obj.nextInt();

        /*****************************Pattern Plus************************************/

        for(int i = 1 ; i <= n ; i++){
            for (int j = 1;j<=n;j++){
                if(i==n/2+1||j==n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
