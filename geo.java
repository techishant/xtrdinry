public class geo{
    public static void main(){
        for( int i = 0; i <= 10 ; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0)
                System.out.print("| ");
                else if (j == i)
                System.out.print("\\ ");
                else{
                    if (i == 10)
                    System.out.print("_ ");
                    else
                    System.out.print("  ");
                }
                
            }
            System.out.print("\n");
        }
    }
}