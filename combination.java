public class combination{
    public static void foo(int[] arr, int[] data, int start, int end, int index, int r){
        if(index == r){
            printArr(data);
            return;
        }
        for(int i = start; i<=end && end-i+1>=r-index; i++){
            data[index] = arr[i];
            foo(arr, data, i+1, end, index+1, r);
        }
    }
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(){
        int[] arr = {1,2,3};
        int[] data = new int[arr.length];
        foo(arr, data, 0, arr.length-1,0,arr.length);
    }
}