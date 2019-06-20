import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      list[i]=in.nextInt();
    }
    boolean perfect= true;
    int sum_of_batch=list[0]+list[1]+list[2];
    int curr_sum_batch;
    for(int i =3;i<=n-1;i=i+3)
    {
      curr_sum_batch=list[i]+list[i+1]+list[i+2]; 
      if(curr_sum_batch!=sum_of_batch)
        perfect=false;
    }
      if(perfect==true)
        System.out.println("Perfect Batch");
    else if(perfect==false)
      System.out.println("Not a Perfect Batch");
    }
  
}