package pixl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
 
public class art {
    public static void main(String[] args) {
        
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        BufferedImage img = null;
            try 
            {
                img = ImageIO.read(new File("pixl\\SS.png")); 
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
        }
        int rgbArr[] =new int[img.getHeight()*img.getWidth()];
        System.out.println(img.getWidth() + " " + img.getHeight()); 
        img.getRGB(0,0,img.getWidth(),img.getHeight(),rgbArr,0,img.getWidth());
        
        String density = "Ñ@#W$9876543210?!abc;:+=-,._    ";

        int argb=0;
        int av;
        int index = 0;
        for(int i = 0;i<rgbArr.length;i+=1){
            index++;
            // av = (rgbArr[i]+rgbArr[i+1]+rgbArr[i+2])/3;
            argb =rgbArr[i];
            int a = (argb>>24)&0xff;
            int r = (argb>>16)&0xff;
            int g = (argb>>8)&0xff;
            int b = argb&0xff;
            av = (r + g + b)/3;
            
            if(scale(av,density.length()) == -1) System.out.println(av);
            System.out.print(density.charAt(scale(av,density.length())));
                
            if(index >= img.getWidth()){
                index = 0;
                System.out.println();
            }
        }
    }
    public static int scale(int n, int k){
        double c = 255.0/k;
        for(int i = 1; i<=k; i++){
            if(n<=(Math.ceil(i*c)) && n>=(Math.floor((i-1)*c))){
                return i-1;
            }
        }
        return -1;
    }
}