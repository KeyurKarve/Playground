import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int s1=0,s2=0;
       int arr[]=new int[size];
      int arr1[]=new int[size];
      int arr2[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
        if(arr[i]==0)
        { arr1[s1]=arr[i];s1++; }
        else
        { arr2[s2]=arr[i];s2++; }
      }
      int p1=0;
      for(int i=0;i<s2;i++)
      {
       arr[p1]=arr2[i];
        p1++;
      }
       for(int i=0;i<s1;i++)
      {
       arr[p1]=arr1[i];
        p1++;
      }
      for(int i=0;i<size;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
}