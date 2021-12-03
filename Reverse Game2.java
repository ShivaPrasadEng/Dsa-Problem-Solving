//Reverse Game
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
        
        for(int i=1;i<=T;i++){
            int N=sc.nextInt();
            int c=0;
            for(int j=N;j!=0;){//12
                int d=j%10;//2 
                c=c*10+d;//3
               // System.out.print(c);
                j=j/10;
            }
            System.out.println(c);
        }

    }
}
