import java.util.*;
public class Main {  
    public static void main(String[] args) {  
          Scanner sc =new Scanner(System.in);
          int n = sc.nextInt();

        for(int i = 1 ;i<=9;i++){
        int c = 0;
        int temp = n;
          while(temp!=0)
          {
              int rem = temp%10;
              if(rem==i)
              c++;
              temp=temp/10;
          } 
          if(c>0)
          System.out.println(i +"-"+ c);
        }
        }
}  


in form of arrays

import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=1;i<=9;i++)
    {
      int c=1;
      
      while(c>=1)
      {
          c = 0;
        for(int j = 0 ;j<n;j++)
        {
        if(arr[j]==i)
        c++;
        }
         if(c>0)
      System.out.println(i + " - " + c);
      c=0;
      }
     

    }
  }
}