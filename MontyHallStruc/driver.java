package MontyHallStruc;
public class driver{
    public static void main(){
        int gold =(int) (Math.random()*10);
        gold = gold%3 + 1;
        
        int n =(int) (Math.random()*10);
        n = n%3 + 1;
        
        int t = 4096;
        int[] sw = new int[t];
        int[] nm = new int[t];
        
        for(int i = 0; i<t; i++){
            gold = (int) (Math.random()*10);
            gold = gold%3 + 1;
            
            n = (int) (Math.random()*10);
            n = n%3 + 1;
            
            
            sw[i] = Monty.main(gold, n , 'y');
            nm[i] = Monty.main(gold, n , 'n');    
        }
        
        double swP= 0;
        double nmP = 0;
        
        for(int i = 0; i<t; i++){
            swP += sw[i];
            System.out.print(sw[i] + ", ");
        }
        System.out.println();
        for(int i = 0; i<t; i++){
            nmP += nm[i];
            System.out.print(nm[i] + ", ");
        }
        System.out.println();
        
        
        swP =(double) swP/t * 100;
        nmP =(double) nmP/t * 100;
        
        System.out.println("Swapped Percent = " + swP);
        System.out.println("No Swap Percent = " + nmP);
    }
}