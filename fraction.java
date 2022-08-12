import java.util.Scanner;
public class fraction{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Fraction");
        int a = in.nextInt();// 1
        System.out.println("-");
        int b = in.nextInt();// 2

        System.out.println("Enter Second Fraction");
        int c = in.nextInt();// 3
        System.out.println("-");
        int d = in.nextInt();// 4
        
        int x,y;
        
        y = b*d;// 4*2 = 8
        if (y%b != 0 || y%d != 0) System.out.println("Err");
        x = (a*(y/b)) + (c*(y/d));// 1*(8/2) + 3*(8/4) => 4 + 6
        System.out.println("Sum:\n" + x + "\n----\n" + y);
                
        int nums[] = {2,3,5,7,9};
        int m;
        for (int j = 0; j <3 ; j++){
            for (int i = 0; i < nums.length;i++){
            if (x % nums[i] == 0 && y % nums[i] == 0){
                x = x/nums[i];
                y = y/nums[i];
            }else{
                continue;
            }
        }
        }
        System.out.println("==> \n" + x + "\n----\n" + y);

        
        
    }
}