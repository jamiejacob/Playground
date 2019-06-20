import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(square(n));
	} 
  public static int square(int num1)
  {
    int result = num1*num1;
    return result;
  }
}