import java.util.Scanner;
class Main{
    
    public static int isprime(int n)
    {
     int k=n/2,flag=1;
      while(k>1)
     {
       if(n%k==0) {flag=0;}
        k--;
     }
     if(flag==1) return 1;
      else return 0;
    }
  
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
      while(i!=n)
      {
      if(isprime(i)==1) 
      {
        System.out.print(i+"\n");
      }
        i++;
      }
          
	}
}