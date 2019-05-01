import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int in=sc.nextInt();
      int p1=0,p2=1;
      while(p1<size)
      {
        for(p2=p1+1;p2<size;p2++)
        {
          if(arr[p1]+arr[p2]==in)
          {
            System.out.println(arr[p1]+", "+arr[p2]);
          }
        }
        p1++;
      }
        
      
    }
}