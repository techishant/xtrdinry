package recur;

public class reverseString{
    public static String reverseString(String str){
        if(str.equals("")){
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(){
        System.out.println(reverseString("hello"));
    }
}