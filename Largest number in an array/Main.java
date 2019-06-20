import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      int max;
      for (int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      max=arr[0];
     for (int i=0;i<=arr_size-1;i++) 
     {
      if (arr[i]>max)
        max=arr[i];
       }
     System.out.println(max);
    }
}