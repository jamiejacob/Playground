import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      int result=power(b,e);
      System.out.println(result);
	}
  public static int power(int base,int exponent)
  {
    int power=1;
    while(exponent>=1)
    {
      power=power*base;
      exponent--;
    }
    return power;
  }
}