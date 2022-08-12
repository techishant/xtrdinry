import java.util.Scanner;
public class triangle{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Hypotenuse Calculator");
        int n = 9;
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        double c = 0.0;
        for (int i = 1; i<=n; i++){ 
            if (i != 4+1)
            System.out.print("\t");
            else
            System.out.print("a = " + a + "\t");
            for (int j = 1; j<=i; j++){
                if (j==1){
                    System.out.print("| ");
                }else if (j==i){
                    if (i == 4+1){
                        System.out.print("\\ ?(c)");
                    }else{
                        System.out.print("\\ ");
                    }
                }else if(i==n){
                    System.out.print("_ ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\t      b = " + b);
        c = Math.round(Math.sqrt(a*a + b*b)*100.0)/100.0;
        // c = Math.sqrt(a*a + b*b);
        
        System.out.println("-------------\nSol:");
        for (int i = 1; i<=n; i++){ 
            if (i != 4+1)
            System.out.print("\t");
            else
            System.out.print("a = " + a + "\t");
            for (int j = 1; j<=i; j++){
                if (j==1){
                    System.out.print("| ");
                }else if (j==i){
                    if (i == 4+1){
                        System.out.print("\\ " + c);
                    }else{
                        System.out.print("\\ ");
                    }
                }else if(i==n){
                    System.out.print("_ ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\t      b = " + b);
        
        System.out.println("c = " + c);
    }
}