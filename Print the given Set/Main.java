import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      LinkedHashSet<String> lhs=new LinkedHashSet<String>();
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String str=br.readLine();
      String arr[]=str.split(",");
      for(int i=0;i<arr.length;i++)
      {
        lhs.add(arr[i]);
      }
      System.out.println(lhs);
                                           
    }
}