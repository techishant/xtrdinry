public class binarySearch{
    public static void main(int n){
        int arr[]  = {1,3,4,6,7,8,10,13};
        int first = 0; int last = arr.length-1;
        int m = (first + last) /2;
        int target = n;
        int i = 0;
        while (first<=last){
            m = (first+last)/2;
            if(arr[m]<target) first = m+1;
            else if(arr[m] > target) last = m-1;
            else {
                System.out.println("found at Index " + m); i = 1;
                break; 
            }
        }
        if(i ==0)
        System.out.println("not found");
    }
}