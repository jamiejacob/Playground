import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      LinkedList<String> ls=new LinkedList<String>();
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String month=br.readLine();
      String arr[]=month.split(",");
      for(int i=0;i<arr.length;i++)
      {
        ls.add(arr[i]);
      }
      System.out.println(ls);
      System.out.println("Size of the linked list: " +ls.size());
      System.out.println("Is LinkedList empty? " +ls.isEmpty());
      String m1=br.readLine();
      System.out.println("Does LinkedList contains" + " "+m1 + "?");
      System.out.println(ls.contains(m1));
      
    }
}