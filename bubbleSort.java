public class bubbleSort{
    public static void main(){
        
        int arr[] = {9,6,24,3,11,45,2,15};
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j+1]<arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i =0; i<arr.length; i++) System.out.print(arr[i] + ", ");
    }
}