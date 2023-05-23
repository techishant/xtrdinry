public class circle{
    public static void main(String[] args){
        coor[] arr = new coor[(int)Math.ceil((44/7.0)/0.01)];
        int i = 0;
        int r = 22;
        for(float ang = 0.0f; ang < 2*22/7.0; ang+=0.01){
            arr[i] = new coor((float)Math.sin(ang)*r, (float)Math.cos(ang)*r);
            i++;
        }
        print(arr);
        printBoard(arr);
    }
    public static void print(coor[] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i].print();
        }
    }
    public static boolean find(coor arr[], coor k){
        float b = 0.9f;
        for(int i = 0; i<arr.length; i++){
            if(Math.abs(arr[i].x-k.x) < b && Math.abs(arr[i].y-k.y) < b) return true;
        }
        return false;
    }
    public static void printBoard(coor[] arr){
        coor currentCoor = new coor(0,0);
        int l = 51;
        int d = l/2;
        for(int i = 0; i<l; i++){
            for(int j = 0; j<l; j++){
                currentCoor.x = (j-d);
                currentCoor.y = -(i-d);
                if(find(arr, currentCoor))
                System.out.print("O");
                else
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
class coor{
    public float x;
    public float y;
    coor(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void print(){
        System.out.println((int)this.x + " " + (int)this.y);
    }
}