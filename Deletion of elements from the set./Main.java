import java.io.*;
import java.util.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      TreeSet<String> set=new TreeSet<String>();
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    String str=br.readLine();
      String arr[]=str.split(",");
      for(int i=0;i<arr.length;i++)
      {
        set.add(arr[i]);
      }
      System.out.println(set);
      Object arr1[]=set.toArray();
      int n=arr1.length-1;
      while(!(set.isEmpty()))
      {
        Object m=arr1[n];
        set.remove(m);
        System.out.println(set);
        --n;
      }
    }
}