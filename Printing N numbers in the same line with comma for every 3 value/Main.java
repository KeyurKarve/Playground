import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=1;
    int i=0;
    while(count<=n)
    {
 	 
      System.out.print(count++);i++;
      if(i%3==0)
      System.out.print(",");

    }
  }
}