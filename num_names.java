import java.util.Scanner;
public class num_names{
    public static String words[] = {"zero", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "eleven ", "twelve ", "thirteen ", "fourteen ",
            "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
    public static String tens[] = {"ten ", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety ", "hundred "};
    
    public static String out_1to19(int inp){
        String output = "";
        if (inp == 10){
                 output = output.concat(tens[0]);
            }else if(inp >10 && inp <20){
                output = output.concat(words[inp-1]);
            }else{
                output = output.concat(words[inp]);
            }
        return output;
    }
    
    public static String out_20to99(int inp){
        String output = "";
        for (int i=1; i<tens.length; i++){
            int inpModTens = inp%((i+1)*10);
            if (inpModTens <10 && (inp/((i+1)*10)) == 1){
                output = output.concat(tens[i]);
                if (inpModTens !=0){
                    output = output.concat(words[inpModTens]);
                }
                break;
            }
        }
        return output;
    } 
    
     public static String out_100to999(int inp){
        String output = "";
        output = output.concat(words[inp/100]);
        output = output.concat("hundred ");
        if (inp %100  < 20){
            output = output.concat(out_1to19(inp%100));
        }else{
            output = output.concat(out_20to99(inp%100));
        }
        return output;
    }

    public static String out_1000to99999(int inp){
        String output = "";
        output = output.concat( ((inp/1000)<20)? out_1to19(inp/1000): out_20to99(inp/1000) );
        output = output.concat("thousand ");
        if (inp%1000 != 0)
        output = output.concat( ((inp%1000)<20)? out_1to19(inp%1000): ((inp%1000) < 100)? out_20to99(inp%1000): out_100to999(inp%1000) );
        return output;
    }
    
    public static String out_100000to9999999(int inp){
        String output = "";
        output = output.concat(  ((inp/100000)<20)? out_1to19(inp/100000): out_20to99(inp/100000)  );
        output = output.concat("lakh ");
        if (inp%100000 != 0)
        output = output.concat(  (inp<1000000)? out_1000to99999(inp%100000): out_1000to99999(inp%100000)  );
        
        return output;
    }
    
    public static String out_10000000to999999999(int inp){
        String output = "";
        output = output.concat(  ((inp/10000000)<20)? out_1to19(inp/10000000): out_20to99(inp/10000000)  );
        output = output.concat("crore ");
        if (inp%100000 != 0)
        output = output.concat(  (inp<100000000)? out_100000to9999999(inp%10000000): out_100000to9999999(inp%10000000)  );
        
        return output;
    }
    
    
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inp = in.nextInt();
        
        String output = "";
        // 1 to 19
        if (inp < 20){
            output = output.concat(out_1to19(inp));
        }else
        // 20 to 99
        if (inp < 100){
            output = output.concat(out_20to99(inp));
        }else 
        // 100 to 999
        if(inp <1000){
            output = output.concat(out_100to999(inp));
        }else
        // 1000 to 99999
        if (inp < 100000){
            output = out_1000to99999(inp);
        }
        else if (inp < 10000000){
            output = out_100000to9999999(inp);
        }
        else{
            output = out_10000000to999999999(inp);
        }
        
        
        System.out.println(output);
    }
}