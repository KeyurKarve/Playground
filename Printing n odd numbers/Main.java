import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;n>0;n--)
      {
        System.out.println(i);
        i=i+2;
      }
	}
}