public class combinatrix{
    public static void foo(int depth, int node){
        if(depth > 3) return;
        for(int i = 1; i<=3; i++){
            System.out.println(i + " of depth: " + depth + " of node: " + node);
            foo(depth + 1, i);
        }
    }
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(){
       foo(1, 1);
    }
}