import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1,j=n,k;
      for(int k1=1;k1<=n;k1++)
      {
      for(k=1;k<=n;k++)
      {
        if(k==i||k==j)
        {
          System.out.print("*");
        }
        else System.out.print(" ");
        
      }i++;j--;
        System.out.print("\n");
      }
	}
}