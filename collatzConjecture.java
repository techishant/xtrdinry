import java.util.Scanner;

public class collatzConjecture{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = in.nextInt();
        coll(n);
    }
    
    public static void coll(int n){
        System.out.println(n);
        if(n != 1){
            if(n%2 == 0){
                coll(n/2);
            }else{
                coll(3*n+1);
            }    
        }
    }
}