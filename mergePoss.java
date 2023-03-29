public class mergePoss{
    static int a[][] = {{1,1,1,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};

    static int[] n = {0,1};
    static int[] e = {1,0};
    static int[] s = {0, -1};
    static int[] w = {-1,0};
    public static void main(){
        
        System.out.println(isMergePoss());
        
    }
    public static boolean isMergePoss(){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                int[][] valIndex = {{j+n[0], i+n[1]}, {j+s[0], i+s[1]}, {j+e[0], i+e[1]}, {j+w[0], i+w[1]}};
                for(int k = 0; k<valIndex.length; k++){
                    if(valIndex[k][0]>=0 && valIndex[k][1]>=0){
                    if(valIndex[k][0]<4 && valIndex[k][1]<4){
                        if(a[j][i] == a[valIndex[k][0]][valIndex[k][1]] && a[j][i] != 0)
                        return true;
                    }
                    }
                }
            }
        }
        return false;
    }
}