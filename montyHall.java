import java.util.Scanner;
import MontyHallStruc.*;
public class montyHall{
    public static void main(){
        Scanner in = new Scanner(System.in);
        // Keep Gold in a random box;
        int gold =(int) (Math.random()*10);
        gold = gold%3 + 1;
        // System.out.println("Correct is : " + gold);
        
        int c = gold;
        
        System.out.println("Choose a box: ");
        int n = in.nextInt();
        
        if(n != gold){
            c = gold;
        }else{
            c = (n + 1)%3;
        }
        
        System.out.println("Computer Chosed " + c + " . Do u wanna Swapp??(y/n)");
        if(in.next().charAt(0) == 'y'){
            c += n;
            n = c - n;
            c = c - n;
            System.out.println("Swapped");
        }
        
        System.out.println("Correct box is " + gold + " and you are " + n + " and computer is " + c);
    }
}