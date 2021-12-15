//Easy Power
import java.lang.*;
import java.util.*;

public class Main {
    static int power(int A,int B){//2,1,0
        //base condition
        if(B==0){//0==0
            return 1;//1
        }
        //execution condition
        return A*power(A,B-1);//2*p(2,2)=>2*p(2,1)=>2*(2,0)=>
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.print(power(A,B));
        
    }
}
