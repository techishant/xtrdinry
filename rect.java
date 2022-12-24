import java.util.Scanner;
public class rect{
    public static void main(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter length: " );
        int len = in.nextInt();
        System.out.println("Enter Breadth: " );
        int bre = in.nextInt();
        
        for (int b=0;b<=bre;b++){
            for (int l=0; l<=len; l++){
                System.out.print("- ");
            }
            System.out.print("\n");
        }
    }
}