package recur;

public class sum{
    public static int summation(int n){
        if(n<=1) return n;
        return n + summation(n-1);
    }
    public static void main(){
        System.out.println(summation(10));
    }
}