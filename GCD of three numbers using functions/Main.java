import java.util.Scanner;
public class Main{
  public static int compare(int a,int b)
    {
      if(a<=b) return a;
      else return b;
    }
  
    public static int GCD(int a, int b)
    {
      int min=compare(a,b);
      if(a%min==0&&b%min==0)
      {
        return min;
      }
      else
      {
        while(a%min!=0&&b%min!=0)
        {
          min--;
        }
        return min;
      }
    }
  
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int result=GCD(a,b);
		System.out.print(GCD(result,c));	      
	}
}