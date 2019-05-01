import java.util.Scanner;
class Main{
    public static int compare(int a,int b)
    {
      if(a>=b) return a;
      else return b;
    }
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(compare(a,b)>c)
          System.out.print(compare(a,b));
      else
        System.out.print(c);
	}
}