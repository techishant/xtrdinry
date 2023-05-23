public class rev{
    public static void foo(String str, int l){
        if(l<0) return;
        System.out.print(str.charAt(l));
        foo(str,l-1);
    }
    
    public static String rev(String str){
        
    }
    public static void main(){
        String str = "hello i am ishant";
        foo(str, str.length()-1);
    }
}