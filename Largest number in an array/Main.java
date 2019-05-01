import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      int size,i,large=0;
      size=sc.nextInt();
      int arr[]=new int[size];
      for(i=0;i<size;i++)
      {
       arr[i]=sc.nextInt();
      }
      for(i=0;i<size;i++)
      {
        if(arr[i]>=arr[large])
        {
          large=i;
        }
      }
      System.out.print(arr[large]);
        
    }
}