public class fact {
    public static void main(String[] args){
        int A=5;
        System.out.print(factr(A));
    }
    static int factr(int N){
        if(N==0){
            return 1;
        }else{
            int ans= factr(N-1)*N;
            return ans;
        }
    }
}
