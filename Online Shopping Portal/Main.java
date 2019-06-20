import java.util.*;
public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers customerObj1=new Customers(1001, "Saakshi",9000000000L, "Bangalore", "16-Jul-1990", 'F', "Lakme Kajal, Salwar");
      Customers customerObj2=new Customers(1008, "Rahul",9000000001L, "Chennai", "27-Jan-1992", 'M', "T-Shirt,Jeans");
      
      Suppliers supplierObj1=new Suppliers(7901, "ABC Traders",8000000000L, "Mumbai", 10, "Paid", 4.75f);
      Suppliers supplierObj2=new Suppliers(7972, "XYZ Enterprises",8000000900L, "Kolkata", 7, "Unpaid", 4.35f);
      
      customerObj1.displayProfileDetails();
      customerObj2.displayProfileDetails();
      supplierObj1.displayProfileDetails();
      supplierObj2.displayProfileDetails();
    
      customerObj1.editAddress("Coimbatore");
      supplierObj1.editAddress("Delhi");
      
      customerObj1.placeOrder();
      
      supplierObj1.increaseStockLevel(5);
      supplierObj2.increaseStockLevel(10);
    }	
}

class Users {
		//write the logic for the class Users	
  String name;
  long mobileNumber;
  String address;
  public void displayProfileDetails()
  {
    
    System.out.println(name+ ", " +mobileNumber);
  }
  
  public void editAddress(String newAddress)
  {
    System.out.println(name+ ", " +address);
      address=newAddress;
    System.out.println(name+ ", " +address);
  }
}

class Customers extends Users{
		//write the logic for the class Customers	
  int customerId;
  String dateOfBirth;
  char gender;
  String orderHistory;
  
  Customers(int customerId, String name,long mobileNumber, String shippingAddress, String dateOfBirth, char gender, String orderHistory)
  {
    this.customerId=customerId;
    this.name=name;
    this.mobileNumber=mobileNumber;
    this.address=shippingAddress;
    this.dateOfBirth=dateOfBirth;
    this.gender=gender;
    this.orderHistory=orderHistory;
  }
  
  
  public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }
  
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  int supplierId;
  int itemsStock;
  String paymentStatus;
  float feedbackRating;
  
  Suppliers(int supplierId, String name,long mobileNumber, String billingAddress, int itemsStock, String paymentStatus, float feedbackRating)
  {
    this.supplierId=supplierId;
    this.name=name;
    this.mobileNumber=mobileNumber;
    this.address=billingAddress;
    this.itemsStock=itemsStock;
    this.paymentStatus=paymentStatus;
    this.feedbackRating=feedbackRating;
  }
  public void increaseStockLevel(int stock)
  {
    itemsStock=itemsStock+stock;
    System.out.println(name+ ", " +itemsStock);
  }
}