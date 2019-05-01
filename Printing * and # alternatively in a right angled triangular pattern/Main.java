import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      int ch=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=0;j<i;j++)
        {
          if(i==1){ch=0;}
          
          switch(ch)
          {
            case 0:{ System.out.print("*");ch=1;break;}
            case 1:{System.out.print ("#");ch=0;break;} 
          }
        }
        System.out.print("\n");
      }
    }
}