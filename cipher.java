import java.util.Scanner;
public class cipher{
    public static void main(String[] args){
        String a = "Ishant";
        String out = "";
        int key= 1;
        for(int i = 0; i<a.length(); i++){
            out += (char) (a.charAt(i) + key);
        }
        System.out.println(out);
    }
}