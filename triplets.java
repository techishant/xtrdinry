import java.util.Scanner;
public class triplets{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the max Hypotenuse: " );
        int n  = in.nextInt();
        
        for (int H =0; H<=n; H++){
            for (int P = 1; P<= H; P++){
                for (int B = 1; B<=P; B++){
                    if(H*H == P*P + B*B){
                        System.out.println(P + " + " + B + " = " + H);
                        
                    }
                }
            }
        }
        
    }
}