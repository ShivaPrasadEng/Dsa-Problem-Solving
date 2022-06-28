import java.lang.*;
import java.util.*;
public class revString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int i=A.length()-1;
        while(i>=0){
            System.out.print(A.charAt(i));
            i--;
        }
    }
}
