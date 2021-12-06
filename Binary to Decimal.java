// Binary to Decimal
import java.lang.*;
import java.util.*;

public class Main {

    static long binaryToDecimal(long N){
        int i=0;
        long d=0;
        long ans=0;
        while(N!=0){
            d=N%10;
            ans=(long)(ans+(d*Math.pow(2,i)));
            N=N/10;
            i=i+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        long res=binaryToDecimal(A);
        System.out.println(res);
    }
}
