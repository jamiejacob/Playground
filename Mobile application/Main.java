class MyModel1 {
     //write your logic here
  int camera=2;
  String lock="No Lock";
  int display=5;
  
}
class MyModel2 extends MyModel1 {
     //write your logic here
  int camera=5;
  String lock="Fingerprint";
  
}
class MyModel2T extends MyModel2 {
     //write your logic here
  int camera=16;
  int display=6;
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel1 obj=new MyModel1();
      MyModel2 obj1=new MyModel2();
      MyModel2T obj2=new MyModel2T();
      
      System.out.println("Features of MyModel 1");
      System.out.println("Camera mega pixels: " +obj.camera);
      
     System.out.println("Features of MyModel 2");
      System.out.println("Camera mega pixels: " +obj1.camera);
      System.out.println("Lock mechanism: " +obj1.lock);
      System.out.println("Display size: " +obj1.display);
      
       System.out.println("Features of MyModel 2T");
      System.out.println("Camera mega pixels: " +obj2.camera);
      System.out.println("Lock mechanism: " +obj2.lock);
      System.out.println("Display size: " +obj2.display);
    }
}