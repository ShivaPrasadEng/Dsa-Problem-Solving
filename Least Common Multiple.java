//Least Common Multiple(LCM)
//LCM=(A*B)/GCD
public class Solution {
    public int LCM(int A, int B) {
        int gcd=1;
        int f;
        if(A<=B){
            f=A;
        }else{
            f=B;
        }

        if(f>1){
        for(int i=2;i<=f;i++){
            if(A%i==0 && B%i==0){
               // System.out.println(i);
               gcd=i;
            }
            
        }
        int lcm=(A*B)/gcd;
        return lcm;
        } else{
            return 1;
        }

    }
}
