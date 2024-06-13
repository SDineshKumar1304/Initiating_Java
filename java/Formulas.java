package DineshNew;
import java.util.Scanner;

public class Formulas {
	static Scanner obj = new Scanner(System.in);
	
	//**************Area of the triangle***********************//
	public static void AreaTriangle() {
		int a,b;
		System.out.print("Enter the height : ");
		a = obj.nextInt();
		System.out.print("Enter the base : ");
		b= obj.nextInt();
		double res = 0.5f * a * b;
		System.err.println("Area of the Triangle : "+res);
	}
	//**************Circumference of the Circle***********************//

	public static void Circumference() {
		int r;
		System.out.print("Enter the radius : ");
		r = obj.nextInt();
		
		double res = 2*(Math.PI)*r; 
		System.out.println("The Circumference of the circle : "+res);
	}
	
	//**************Area of the Circle***********************//

	public static void AreaCircle() {
		int r;
		System.out.print("Enter the radius : ");
		r = obj.nextInt();
		
		double res = (22/7d)*r*r; 
		System.out.println("The Area of the circle : "+res);
	}
	//**************Area of the Rectangle***********************//

	public static void AreaRectangle() {
		int l;int b;
		System.out.print("Enter the length : ");
		l = obj.nextInt();
		System.out.print("Enter the breadth : ");
		b = obj.nextInt();
		double res = l*b; 
		System.out.println("The Area of the rectangle : "+res);
	}
	//**************Volume of the Cylinder***********************//

	public static void VolumeCylinder() {
		int r,h;
		System.out.print("Enter the radius : ");
		r = obj.nextInt();
		System.out.print("Enter the height : ");
		h = obj.nextInt();
		double res = Math.PI*r*r*h; 
		System.err.println("The Volume of the Cylinder is : "+res);
		
	}
	
	
	//*****************Main Method*******************//

	public static void main(String[] args) {
		int user;
        System.out.println("Your Option are 1,2,3,4");
        System.out.println("Option 1 = Area of Triangle");
        System.out.println("Option 2 = Area of Circle");
        System.out.println("Option 3 = Circumference of the Circle");
        System.out.println("Option 4 = Area of the Rectangle");
        System.out.println("Option 5 = Volume of Cylinder");
        System.out.print("Enter your option : ");
        user=obj.nextInt();
        
        
    //*******************Decision Statement***********************//

        if(user==1){
        	AreaTriangle();
        }
        else if (user==2){
           AreaCircle();
        }
        else if (user==3){
        	Circumference();
        }
        else if (user==4) {
        	AreaRectangle();
        }
        else if (user==5) {
        	VolumeCylinder();
        }
        else {
        	System.err.println("No Option Selected!!!");
        }
            obj.close();
				
	}
}
