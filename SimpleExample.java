import java.awt.*;
import java.util.Scanner;

public class SimpleExample extends Frame{
    SimpleExample(){  
        
        Object[] arr = new Object[12];
        String data[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"},{" ", "0", " "}};
        int c = 0;int y = 50;
        for (int i=0; i<4; i++){
            for(int j = 0; j<3; j++){
                Button b=new Button(data[i][j]); 
                b.setBounds(100,100,100,1100);  
                add(b);
                arr[c] =b;
                c++;
            }
            y = y+10;
        }
        
        setSize(500,300);
        setTitle("1234");
        setLayout(new FlowLayout());
        setVisible(true);  
    }  
    public static void main(String args[]){
        SimpleExample fr=new SimpleExample();  
    }
}