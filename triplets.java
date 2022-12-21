public class triplets{
    public static void main(String[] args){
        int v;
        for (int H =0; H<=100; H++){
            for (int P = 1; P<= H; P++){
                for (int B = 1; B<=P; B++){
                    if(H*H == P*P + B*B){
                        System.out.println(H + " = " + P + " + " + B);
                        
                    }
                }
            }
        }
        
    }
}