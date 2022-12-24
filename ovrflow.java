/**
 * This Program prints the maximum limit that can be stored in a long variable.
 */

public class ovrflow{
    public static void main(){
        long o = ((long)Math.pow(2,64))+1;
        System.out.println(o);
        
    }
}