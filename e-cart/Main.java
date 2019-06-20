//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price)
  {
    this.price=price;
  }
  public int getPrice()
  {
    return this.price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product)
  {
    this.product=product;
  }
  public String getProduct()
  {
    return this.product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity=quantity;
  }
  public int getQuantity()
  {
    return this.quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
  public int amount(int p,int q)
  {
  int amount =p*q;
    return amount;
}
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner in = new Scanner(System.in);
    String product=in.nextLine();
    int price=in.nextInt();
    int qty=in.nextInt();
    i.setPrice(price);
    c.setQuantity(qty);
    int p=i.getPrice();
    int q=c.getQuantity();
    int result=obj.amount(p,q);
    System.out.println("Total Price is : " + result);
    
  }
}