public class ExampleProgram {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int result = binarySearch(nums, target);
        System.out.println("The target is at index: " + result);
    }
    
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // bug: always returns -1
    }
}
