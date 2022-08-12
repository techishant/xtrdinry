import java.awt.*;
public class awt extends Frame{
    awt(){
        Button btn = new Button("123");
        btn.setBounds(100,100,200,120);  
        add(btn);
        setSize(500,300);
        setTitle("1234");
        setLayout(new FlowLayout());
        setVisible(true);  
    }
    public static void main(){
        awt fr = new awt();
        
    }
}
