// /Print the Primes!
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=2;i<=N;i++){
            int j=2;
            for(;j<=i-1;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.println(i);
            }
        }
    }
}
