package HP;

import java.util.Scanner;
/**
 * S = 1/1 + 1/2 + 1/3 + 1/4 ....
 */
public class sim{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = in.nextInt();
        double sum = 0.0;
        
        for(int i = 1; i<= n; i++){  
            sum += (double)1/i;
            System.out.println(i + " " + sum);
        }
        System.out.println("SUM: " + sum);
    }
}