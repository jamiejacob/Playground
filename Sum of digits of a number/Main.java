import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int rem;
      int sum=0;
      while(n>0)
      {
        rem=n%10;
        sum = sum + rem;
        n=n/10;
      }
      System.out.println(sum);
	}
}