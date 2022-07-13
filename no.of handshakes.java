import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int handShakes = (num * (num-1))/2;
        System.out.println(handShakes);
        
    }
}