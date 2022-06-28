public class pow2 {
    public static void main(String[] args){
        int A=16;
        System.out.print(isPowerOfTwo(A));
    }
    public static boolean isPowerOfTwo(int n) {
        boolean r=false;
        if(n==1){
            return true;
        }
        while(n>0){//16
            if(n%2==0){//0
                if(n/2==0){//0
                    r=true;
                    n=n/2;//8
                }
            }
            r=false;
        }
        return r;
    }
}
