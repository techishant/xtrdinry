public class rads{
    public static void main(){
        int c = 0;
        for(double i = 0.1; i<=3*Math.PI; i+= 0.1){
            c++;
            System.out.println(Math.sin(i));
        }
        System.out.println(c);
        
        int[] n = new int[8];
        System.out.println(n.length);
        n = new int[10];
        System.out.println(n.length);
        
        for(int i = 1; i<=10; i++){
            System.out.println(i*Math.PI/0.1);
        }
    }
}