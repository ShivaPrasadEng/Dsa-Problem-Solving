//Characters Stair Pattern
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        int i=1;
        int a=64;
        while(i<=N){
            int j=1;
            while(j<=i){
              System.out.print((char)(a+i));  
              if(i!=j){
               System.out.print(" ");   
              }
              j++;    
            }
            i++;
            System.out.println();
        }


    }
}
