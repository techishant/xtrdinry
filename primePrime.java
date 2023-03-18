import java.lang.Runtime;
import java.lang.Exception;
public class primePrime{
    public static void main(String[] args){
        boolean isPrimeFactored = false;
        for(int i = 1; i<2000; i++){
            isPrimeFactored = checkPrimeFactors(i);
            if(isPrimeFactored) {
                System.out.print(i + ": " );
                findFactors(i);
            }
        }
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        clearConsole();
    }
    
    static boolean checkPrimeFactors(int n){
        for(int i=2; i<=n; i++){
            if(n%i == 0) {
                boolean isPrime = true;
                int valToBeChecked = i;
                while(isPrime){
                    for(int k = 1; k<i; k++){
                        if(i%k == 0){
                            valToBeChecked = k;
                            continue;
                        }
                    }
                    break;
                }
            }
        }
        return true;
    }
    
    static void findFactors(int n){
        for(int i = 2; i<n; i++){
            if(n%i == 0) System.out.print(i + ", ");
        }
        System.out.println();
    }
    
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
            System.out.println("uff");
            e.printStackTrace();
        }
    }
}