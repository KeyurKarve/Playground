import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int s=1;
       while(n>0)
       {
         s=s*n--;
       }
      System.out.println(s);
	}
}