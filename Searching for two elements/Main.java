import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int size;
      size=sc.nextInt();
      int arr[]=new int[size];
      int i,el1,el2;
      for(i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      el1=sc.nextInt();
      el2=sc.nextInt();
      int pos1=-1,pos2=-1,flag=0;
      for(i=0;i<size;i++)
      {
        if(flag>2){break;}
        if(arr[i]==el1){
        pos1=i;
        flag++;
        }
        if(arr[i]==el2){
          pos2=i;
          flag++;
        }
      }
      System.out.println(pos1);
      System.out.println(pos2);
      
      
    }
}