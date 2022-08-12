import javax.swing.JOptionPane;

public class jvx{
    public static void main(){
        String name = JOptionPane.showInputDialog("Enter Your name: ");
        JOptionPane.showMessageDialog(null, "hello " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You're " + age);
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height: "));
        JOptionPane.showMessageDialog(null, "Your height is " + height);
    }
}