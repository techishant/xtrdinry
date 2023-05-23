public class permut{
    public static void foo(int arr[], int l, int r){
        if (l == r)
            printArr(arr);
        else {
            for (int i = l; i <= r; i++) {
                arr = swap(arr, l, i);
                foo(arr, l + 1, r);
                arr = swap(arr, l, i);
            }
        }
    }
    public static int[] swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        return a;
    }
    public static void printArr(int arr[]){
        for(int i =0 ;i<arr.length; i++) System.out.print(arr[i] + ", ");
        System.out.println();
    }
    public static void main(){
        int[] a = {1,2,3,4};
        foo(a, 0, a.length-1);
    }
}