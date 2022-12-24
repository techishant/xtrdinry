import java.util.Scanner;
public class factorial{
    static int facto = 1;
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num = in.nextInt();
        System.out.println(fact(num));
    }
    
    
    public static int fact(int n){
        facto = facto * n;
        if (n > 1){
            fact(n-1);
        }
        return facto;        
    }
}