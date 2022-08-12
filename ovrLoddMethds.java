/**
 * method signature = method name + parameters
 * In parameters dataTypes and no. of parameters matters. Identifier doesn't matter.
 */
public class ovrLoddMethds{
    public static void main(){
        int x =  add(1, 1);
        double y = add(1.0, 2.0, 3.0);
        
    }
    
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
    
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }
    
    static int add(int a, int b, int c,int d) {
        return a+b+c+d;
    }
    
    static double add(double a, double b, double c, double d){
        return a+b+c+d;
    }
}
