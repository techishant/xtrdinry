import java.util.Scanner;
public class infSum{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. to be added(0 to get sum):\n****************");
        long t = 17576;
        double n;
        double sum = 0.0;
        
        for (int i = 1; i<=t; i++){
            System.out.print("n " + i + ":\t");
            n = in.nextDouble();
            if (n == 0){System.out.println("----------------"); break;}
            sum = sum + n;
        }
        System.out.print("Sum:\t");
        System.out.println(sum);
    }
}