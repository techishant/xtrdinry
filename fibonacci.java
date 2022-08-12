public class fibonacci{
    public static void main(){
        int f;
        int a = 0; int b = 1;
        for(int i =0; i<=10; i++){
            f = a +b;
            System.out.println(a + " + " + b + " = " + f);
            a =b;
            b =f;
        }
    }
}