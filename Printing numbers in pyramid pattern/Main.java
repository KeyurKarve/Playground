import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
      int count =0;
       for(int i=1;i<=n;i++)
       {
         for(int j=0;j<n-i;j++)
         {
           System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
           System.out.print(++count+" ");
         }
         System.out.print("\n");
       }
          
                                
	}
}