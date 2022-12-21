public class sinMsg{
    public static void main(){
        int amp = 16; int d;
        for(double i = 0.1; i<=360; i+=0.1){
            d = (int) Math.round(Math.sin(i) * amp);
            for(int j = -amp; j<= d; j++){
                System.out.print(" ");
            }
            System.out.println("Ishant Sharma");
        }
    }
}

