public class sinMsg{
    public static void main(){
        long initialTime;
        
        /**
         * Working with frequency is fun:
         * like if you set frequency to 3 it makes a DNA shape and if too high it forms a nice wave
         * 
         * amp or amplitude can increase the displacement of wave from mean position.
         */
        int amp = 16; double freq = 0.01;
        
        
        String text = "Ishant Sharma";
        int d;
        for(double i = 0.1; i<=360; i+= freq){
            d = (int) Math.round(Math.sin(i) * amp);
            for(int j = -amp; j<= d; j++){
                System.out.print(" ");
            }
            System.out.println(text);
            
            // Remove the bottom code if you don't need animations
            initialTime = System.nanoTime();
            for(int k = 0; k==k; k=k){
                if(System.nanoTime() > initialTime+Math.pow(10,7))
                    break;
            }
            
        }
    }
}

