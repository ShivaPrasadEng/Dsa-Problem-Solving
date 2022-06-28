public class sqrt {
    public static void main(String args[]){
        System.out.print(sqrtt(2147483647));
    }

    public static int sqrtt(int A) {
        long start=1;
        long end =A;
        long Ans=0;

        while(start<=end){
            long mid=(start+end)/2;
            if(mid*mid<=A){
                Ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return (int)Ans;
    }
}
