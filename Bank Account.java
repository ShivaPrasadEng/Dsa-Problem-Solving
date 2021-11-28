//Bank Account
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner aa=new Scanner(System.in);

        long N=aa.nextLong();
        int M= aa.nextInt();

        for(int i=0;i<M;i++){
            long type=aa.nextLong();
            long amt=aa.nextLong();
            if(type==1){
                N=N+amt;
                System.out.println(N);
            }else{
                if(amt>N){
                   System.out.println("Insufficient Funds"); 
                }else{
                    N=N-amt;
                    System.out.println(N);
                }
            }
        }
                
    }
}
