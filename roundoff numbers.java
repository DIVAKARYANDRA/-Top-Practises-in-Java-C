import java.util.*;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double d =1.2345;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(d));
    } 
}