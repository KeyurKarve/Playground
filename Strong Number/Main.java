import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
      int digit=0,sum=0,n2,n3,facto;
      int n=sc.nextInt();
      n2=n;
      n3=n;
      //while loop to count number of digit
      
      while(n>0)
      {
        facto=1;
        n3=n%10;
        while((n3)>0)
        {
          facto=facto*n3--;
        }
        sum=sum+facto;
        n=n/10;
      }
      if(sum==n2)
      System.out.println("Yes");
      else
         System.out.println("No");
        
	}
}