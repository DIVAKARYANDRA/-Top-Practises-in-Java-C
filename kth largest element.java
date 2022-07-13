import java.util.*;
public class Main{
  public static int smallest(int[] arr, int k,int n)
  {
    Arrays.sort(arr);
    if(k==1)
    return arr[n];
    else
    return arr[n-k+1];
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    System.out.println(smallest(arr,k,n-1));
  }
}