import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       LinkedHashSet<String> lhs=new LinkedHashSet<String>();
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String str=br.readLine();
      String arr[]=str.split(",");
      for(int i=0;i<arr.length;i++)
      {
        lhs.add(arr[i]);
      }
      System.out.println(lhs);
      System.out.print("Enter the value to be deleted: ");
      String m=br.readLine();
      System.out.println(m);
      lhs.remove(m);
      System.out.println(lhs);
      System.out.print("Enter the value to be added: ");
      String s=br.readLine();
      System.out.println(s);
      lhs.add(s);
      System.out.println(lhs);
    }
}