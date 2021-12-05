//Easy Power
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();//2
        int B=sc.nextInt();//3
        int i=1;
        int P=1;
        while(i<=B){//3<=3
            P=P*A;//1*2*2*2
            i=i+1;//4
        }
        System.out.print(P);
    }
}
//2 power 3
//2*2*2
