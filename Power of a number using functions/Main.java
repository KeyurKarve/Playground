import java.util.Scanner;
class Main{
    public static void exp(int n,int m)
    {
      int result=1;
      while(m>0)
      {
        result=result*n;
        m--;
      }
      System.out.print(result);
    }
  
  
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      exp(n,m);
	}
}