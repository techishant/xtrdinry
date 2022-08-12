import java.util.Random;

public class rndm{
    public static void main(){
        Random ran = new Random();
        
        int x = ran.nextInt(6);
        System.out.println(x+1);
    }
}