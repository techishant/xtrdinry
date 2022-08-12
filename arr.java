public class arr{
    public static void main(){
        String arr[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"},{" ", "0", " "}};
        String arr2[] = new String[12];
        
        int c = 0;
        for (int i =0; i <4; i++){
            for (int j = 0; j <3; j ++){
                System.out.print(arr[i][j] + "\t");
                arr2[c] = arr[i][j];
                c++;
            }
            System.out.print("\n");
        }
        for(int k = 0; k < arr2.length; k++){
            System.out.println(arr2[k]);
        }
    }
}