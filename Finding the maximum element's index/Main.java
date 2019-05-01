import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int size,i;
    size=sc.nextInt();
    int arr[]=new int[size];
    for(i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    int max=0;
    for( i=1;i<size;i++)
    {
      if(arr[i]>=arr[max]){max=i;}
    }
    System.out.print(max);
  }
}