//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary()
  {
    //write your Faculty class statements
  }
}
class CSE
{
  public void salary()
  {
    //write your CSE class statements
  }
}
class IT
{
  public void salary()
  {
    //write your IT class statements
  }
}
class ECE
{
  public void salary()
  {
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Faculty fc=new Faculty();
    ECE obj = new ECE();
    CSE obj1=new CSE();
    IT obj2=new IT();
    Scanner in =new Scanner(System.in);
    int base_sal=in.nextInt();
   // fc.salary(base_sal);
    //obj.salary(base_sal);
   // obj1.salary(base_sal);
    //obj2.salary(base_sal);
    System.out.println("Base Salary: " + base_sal);
    System.out.println("CSE Faculty: "+ (base_sal +3000));
    System.out.println("IT Faculty: "+ (base_sal +5000));
    System.out.println("ECE Faculty: "+ (base_sal +4500));
    //implement your required concept here
  }
}