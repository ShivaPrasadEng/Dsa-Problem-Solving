//Sum the digits
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T!=0){ //2
            int d=0;
            int N=sc.nextInt(); //24 43
            while(N!=0){//24
                d=d+N%10;//24%10=>0+4,4+2%10=>4+2=>6
                N=N/10;//24/10=>2/10=>0
            }
            System.out.println(d);
            --T;
        }

    }
}
