/**
 * 
 * Enter a odd no.:
 * 5
 *   *    *
 *  ***  **
 * ********
 *  ***  **
 *   *    *
*/
import java.util.Scanner;

public class fishPattern{
    public static String mul(String s, int n){
        String s1 = "";
        for(int i=1; i<=n; i++){
            s1 += s;
        }
        return s1;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a odd no.:" );
        
        int n = in.nextInt();
        int d = n/2;
        String s1, s2,s3, s4;
        int d1;
        for (int i = 1; i<=n; i++){
            d1 = Math.abs(d);
            
            s1 = mul(" ", d1);
            s2 = mul("*", n - (2*d1));
            s3 = mul(" ", d1*2);
            s4 = mul("*", ((n/2)+1)-d1);
            System.out.println(s1 + s2 + s3 + s4);
            
            d--;
        }
    }
}