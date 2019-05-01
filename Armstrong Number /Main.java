import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int digit=0,sum=0,n2,n3,pow;
      int n=sc.nextInt();
      n2=n;
      n3=n;
      //while loop to count number of digit
      while(n2>0)
      {
        digit++;
        n2=n2/10;
      }
      
      //loop to calculate  sum
      while(n>0)
      {
        pow=1;
        for(int i=0;i<digit;i++)
        {
          pow=(n%10)*pow;
        }
        sum=sum+pow;
        n=n/10;
      }
     //to print RESULT
      if(sum==n3)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}