import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num=in.nextInt();
    int n1=num%10;
    int n2=(num/10)%10;
    int n3=num/100;
    int num2=(n1*100)+(n2*10)+(n3*1);
    System.out.println(num2);
  }
}