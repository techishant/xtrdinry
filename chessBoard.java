public class chessBoard{
    public static void main(String[] args){
        String ch = "";
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                ch = "X";
                if((i+j)%2 == 0) ch = "0";
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}