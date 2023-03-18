public class gravityArr{
    /**
     * It takes an array as input and a vector
     */
    static int[][] displace(int[][] a, int[] v){
        // Making a copy of the input array
        int arr[][] = a.clone();
        for(int i = 0; i<arr.length; i++){
            arr[i] = a[i].clone();
        }
        
        boolean swapped = true; // to displace again and again until all the values are displace completely
        int startX, startY, endX, endY, temp;
        // calculating the starting and ending value for the loop to iterate
        if(v[0] < 0 || v[1] < 0){
            startX = Math.abs(v[0]);
            startY = Math.abs(v[1]);
            endY = arr.length;
            endX = arr[0].length;
        }else{
            startX = 0;
            startY = 0;
            endY = arr.length-v[1];
            endX = arr[0].length-v[0];
        }
        while(swapped){
            swapped = false;
            for(int y = startY; y<endY; y++){
                // recalculating the ending values for the arrays that are not perfect( i mean have different lengths)
                if(v[0] < 0 || v[1] < 0){
                    endY = arr.length;
                    endX = arr[y].length;
                }else{
                    endY = arr.length-v[1];
                    endX = arr[y].length-v[0];
                }
                for(int x = startX; x<endX; x++){
                    if(arr[y][x] == 1 && arr[y+v[1]][x+v[0]] == 0){
                        arr[y][x] = 0;
                        arr[y+v[1]][x+v[0]] = 1;
                        swapped  = true;
                    }
                }
            }
        }
        return arr;
    }
    static void print(int arr[][]){
        // iterating through the given array and printing the values;
        for(int y = 0; y<arr.length; y++){
            for(int x = 0; x<arr[y].length; x++){
                System.out.print(arr[y][x] + ", ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        
        // declaring and initialising an array
        int a[][] = { {1,0,0},
                        {0,1,1},
                        {0,0,1},
                        {0,0,0},
                        {0,1,0}};
        
        print(a);
        // vector for displacing
        /**
         *  1, 0 - to right
         * -1, 0 - to left
         *  0, 1 - to down
         *  0,-1 - to up
         */
        int[] v = {0,1};
        //calling displace
        int b[][] = displace(a,v);
        
        System.out.println("-------------------");
        print(b);
    }
    
}