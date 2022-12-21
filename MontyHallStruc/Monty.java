package MontyHallStruc;

public class Monty{
    public static int main(int gold, int n, char swap){
        // Keep Gold in a random box;
        
        // System.out.println("Correct is : " + gold);
        
        int c = gold;
        
        if(n != gold){
            c = gold;
        }else{
            c = (n + 1)%3;
        }
        
        //System.out.println("Computer Chosed " + c + " . Do u wanna Swapp??(y/n)");
        if(swap == 'y'){
            c += n;
            n = c - n;
            c = c - n;
            //System.out.println("Swapped");
        }
        
        if (n == gold){
            return 1;
        }
        return 0;
    }
}