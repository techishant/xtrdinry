public class selectionSort{
    public static void main(){
        int[] arr = {6,9,3,11,14,45,2,15};
    
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j] < arr[min]) min = j;
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
}