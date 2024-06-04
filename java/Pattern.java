import java.util.Scanner;
class Pattern{
    public static  void main(String args[]){
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n =obj.nextInt(); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){// same input n to get n*n output
                System.out.print('*');
            } 
            System.out.println();
        }
        obj.close();
    }
}
