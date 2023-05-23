public class recurro{
    public static int count(int i, int n, int sum){
        if(n>=0){
            sum += i;
            return count(i+1, n-1,sum);
        }
        return sum;
    }
    public static void fibo(int a, int b, int n){
        if(n>=0){
            System.out.println(a+b);
            fibo(b, a+b, n-1);
        }
    }
    
    public static void main(){
        System.out.println("Hello World");
        System.out.println(count(0,10,0));
        fibo(0,1,20);
    }
}