public class newspaper {
    public static void main(String[] args){
    //  int  C = 2;
      // int[] D = {1, 0, 0, 0, 0, 0, 0};
        int  C = 433;
        int[] D = {109, 58, 77, 10, 39, 125, 15};
       System.out.print(solve(C,D));
    }
    static int solve(int A, int[] B) {
        int sum=0;
        int i=0;
        while(sum<A){//418<433
            sum = sum + B[i];//433
            if(sum<A) {
                if (i < 6) {//6<6
                    i++;//6
                }else{
                    i=0;
                }
            }else {
                i = i;//1
            }
        }
        return i+1;
    }
}
