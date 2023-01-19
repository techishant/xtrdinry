package pixl;

import java.io.IOException;
import java.io.FileWriter;

public class reader{
    public static void main(String[] args){
        
        FileWriter fWriter = null;
        
        try 
        {
            fWriter = new FileWriter(
            "pixl\\out.txt"); 
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}