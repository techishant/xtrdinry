/**
 * This program is to check whether the given number 
 * of any no. of digits is an Armstrong Number.
 * Refer pg: 112 (Note) 
 */
import java.util.Scanner;
public class armstrong{
    /**
     * n : store the input number
     * n_ : copy of the stored number
     * p : store the number of digits
     * d : store individual digit
     * sum : store the expression for armstrong number
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int n_ = n; int d; double sum = 0;
        int p = (int) (Math.log10(n) + 1);
        while(n_ > 0){
            d = n_%10;
            sum += Math.pow(d,p);
            n_ = n_ / 10;
        }
        if(sum == n)
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }
}


