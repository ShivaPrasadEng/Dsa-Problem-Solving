//Print all primes less than or equal to n
import java.lang.*;
import java.util.*;

public class Main {
static void rangePrime(int R){//10
    if(R>2){
        for(int i=2;i<=R;i++){//1,2,3,4,5,6,7,8,9,10
            if(isPrime(i)){//2
            	System.out.print(i+" ");
            }
        }
        System.out.println();
       }else
        System.out.println("There are no prime numbers less than or equal to "+R);
    }
    
    static boolean isPrime(int N){//4
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
             Scanner sc=new Scanner(System.in);
	        int A=sc.nextInt();
	        //int B=sc.nextInt();
	        rangePrime(A);//10
	        //System.out.print(isPrime(A));
    }
}
