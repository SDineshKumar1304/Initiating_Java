import java.util.Scanner;
class Problem1{

    static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = obj.nextInt();

        /*****************************Pattern Square************************************/

        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}