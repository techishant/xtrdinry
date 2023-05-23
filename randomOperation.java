import java.util.Scanner;
public class randomOperation{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int a; int b;
        while(true){
            a = (int)(Math.random()*10+10);
            b = (int)(Math.random()*10);
            System.out.println(a + " * " + b + " = ");
            int c_ = a*b;
            int c = in.nextInt();
            if(c_ == c) continue;
            else System.out.println(c_);
        }
    }
}