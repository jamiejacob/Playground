import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
      String str=scan.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=sb.length();
      boolean is_matching=true;
      int front=0;
      int end=str_len-1;
      while(front<end)
      {
        if(sb.charAt(front)!=sb.charAt(end))
        {
          is_matching=false;
          break;
        }
        front++;
        end--;
      }
      if(is_matching==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}