import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
   System.out.print("Enter the number of values to be inserted in map:");
    int n =Integer.parseInt(br.readLine());
      System.out.println(n);
      String name;
      int mark;
      
      for(int i=0;i<n;i++)
      {
        name=br.readLine();
        mark=Integer.parseInt(br.readLine());
        map.put(name,mark);
      }
      System.out.println(map);
      
      System.out.print("Enter the index to be removed:");
      String p=br.readLine();
      System.out.println(p);
      map.remove(p);
     System.out.println(map);
     System.out.println("Size of map is : " +map.size()); 
    }
}