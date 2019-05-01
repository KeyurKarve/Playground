import java.util.Scanner;
class Main{
    public static int sum(int m)
    {int sum=0;
      while(m>0)
      {
        sum=sum+m;
        m--;
      }
     return sum;
    }
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sum(n));
	}
}