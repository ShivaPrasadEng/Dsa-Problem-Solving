//Max of three
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        //System.out.println("A, B, C");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        if(A>=B && A>=C){
            System.out.println(A);
        }
        else if(B>=C){
            System.out.println(B);
        }
        else{
            System.out.println(C);
        } 
        
    }
}
