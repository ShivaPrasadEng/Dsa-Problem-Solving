public class pwr {
    public static void main(String[] args){
        System.out.print(powr(2,4));
    }

    static int powr(int A, int B){
        if(B==1) {
          return A;
        }else{
            int ans=A*powr(A,B-1);
            return ans;
        }
    }
}
