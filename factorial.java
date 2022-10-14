public class factorial{
    public static void main(){
        
        System.out.println(fact(9));
    }
    static int facto = 1;
    
    public static int fact(int n){
        facto = facto * n;
        if (n > 1){
            fact(n-1);
        }
        return facto;        
    }
}