public class GCDMultiple {
    static int m1(int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }
    public static int GSDRes(int A, int B){
        int res= m1(A, B);
        //System.out.print(res);
        //System.out.print("Hi");
        int CD=1;
        for(int i=1;i<=res;i++){
            // System.out.print(i);
            if(A%i==0 && B%i==0){
                CD=i;
            }
        }
        return CD;
    }

    public static void main(String args[]) {
        int p=10;
        int q=22;
        int r=(short)24;

        int res1=GSDRes(p,q);
        int res2=GSDRes(res1,r);
        System.out.print(res1+" ");
        System.out.print(res2);
    }
}
