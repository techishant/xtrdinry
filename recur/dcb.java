package recur;

public class dcb{
    public static String toBinary(int n, String b){
        if(n==0) return b;
        
        return toBinary(n/2, n%2+b);
    }
    public static void main(){
        System.out.println(toBinary(124, ""));
    }
}