public class GCD {
    static int m1(int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String args[]) {
        int A = 9;
        int B = 21;
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
        System.out.print(CD);

    }

}
