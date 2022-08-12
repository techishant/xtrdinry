
public class tmp{
    public static void main(){
        for (int c = 1; c<= 20; c++){
            for (int a = 1; a<= 20; a ++){
                for (int b = 1; b <= 20; b ++){
                    if ((a*a) + (b*b) == (c*c)){
                        if ( Math.sqrt(c*c) == c){
                            System.out.println("a: " + a + " \nb: " + b);
                        }
                    }
                }
            }
        }
    }
}