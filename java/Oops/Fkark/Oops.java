package Oops.Fkark;


public class Oops {
	public static void main(String[] args) {
	Customer c1 = new Customer();
	Products p1 = new Products();
	Shipper sh1 = new Shipper();
	Seller  s1= new Seller();
	
	c1.Customer_name = "Ravi";
	c1.Customer_id = 100;
	c1.Customer_pwd =  "Ravi@123";
	
	p1.P_id = 101;
	p1.P_Name = "Cricket Bat";
	p1.Price = 2000;
	
	sh1.CostofShipment = 30;
	sh1.Shipper_id = 102;
	sh1.Shipper_name ="Roshan";
	
	s1.Seller_id = 103;
	s1.Seller_name  = "Dinesh";
	s1.Seller_rating = 5;
	
	System.out.println("================Customer==================");
	System.out.println("Customer name :"+c1.Customer_name);
	System.out.println("Customer id :"+c1.Customer_id);
	System.out.println("Customer pwd :"+c1.Customer_pwd);
	System.out.println("================Product==================");
	System.out.println("Product id :"+p1.P_id);
	System.out.println("Product Name :"+p1.P_Name);
	System.out.println("Product Price :"+p1.Price);
	System.out.println("================Shipper==================");
	System.out.println("Cost of Shipment :"+sh1.CostofShipment);
	System.out.println("Shipper id :"+sh1.Shipper_id);
	System.out.println("Shipper name :"+sh1.Shipper_name);
	System.out.println("================Seller==================");
	System.out.println("Seller id :"+s1.Seller_id);
	System.out.println("Seller name :"+s1.Seller_name);
	System.out.println("Seller Rating :"+s1.Seller_rating);
	}
}
