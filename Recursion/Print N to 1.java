//print N to 1 using using recursion.
import java.lang.*;
import java.util.*;

public class Main {
    static void nTo(int N){
        //base condition
        if(N==0){
            return;
        }else{
            //execution
            System.out.print(N+" ");
            nTo(N-1);
        }
    }
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        nTo(N);
        
    }
}
