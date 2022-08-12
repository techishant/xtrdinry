import java.util.ArrayList;

public class foreach{
    public static void main(){
        
        // # 1
        System.out.println("#1");
        String animals[] = {"cat", "dog", "Racoon", "mouse"};
        for (String i : animals){
            System.out.println(i);
        }
        
        //  # 2
        System.out.println("#2");
        String name = "Ishant";
        /** for (char i : name){    ##### for-each cannot be implemented on strings only arrays
            System.out.println(i);
        } */
        
        // # 3
        System.out.println("#3");
        ArrayList<String> anim = new ArrayList<String>();
        anim.add("kutta");
        anim.add("billi");
        anim.add("dorimon");
        anim.add("Chuha");
        
        for (String i : anim){
            System.out.println(i);
        }
        
    }
}