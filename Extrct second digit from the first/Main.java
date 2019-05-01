import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int n2=n,count=0;
      while(n!=0)
      {
        count++;
        n=n/10;
        
      }
      while(count!=2)
      {
        n2=n2/10;
        count--;
      }
      n2=n2%10;
      System.out.println(n2);
      
	}
}