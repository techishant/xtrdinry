public class arms{
    public static void main(){
        int  h, t , o;
        for (int n = 1; n<= 999; n++){
            h = n/100; 
            t = (n%100)/10;
            o = (n%100)%10;     
            if (( (h*h*h) + (t*t*t) + (o*o*o)) == n)
            System.out.println(n);
        }
    }
}