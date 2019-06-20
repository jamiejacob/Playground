import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner in = new Scanner(System.in);
    int n =in.nextInt();
    int list[]=new int[n];
   
    
    for(int i=0;i<=n-1;i++)
    {
      list[i]=in.nextInt();
    }
   int max=list[0];
    int index=0;
    
    for(int i=1;i<=n-1;i++)
    {
      if(list[i]>max)
      {
        max=list[i];
        index=i;
      }
    }
    System.out.println(index);
  }
}