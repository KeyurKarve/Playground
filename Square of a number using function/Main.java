import java.util.Scanner;

class Main
{
  	public static int sqr(int m)
    {
      m=m*m;
      return m;
    }
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int result=sqr(n);
      System.out.print(result);
	 // Type your code here   
	} 
}