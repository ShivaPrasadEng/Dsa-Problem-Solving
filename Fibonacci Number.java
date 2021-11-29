//Fibonacci Number
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        int a0=0;
        int a1=1;
        int ans=0;
        //int a3=a1+a2;

        for(int i=2;i<=A;i++){
            ans=a0+a1;
            a0=a1;
            a1=ans;
        }
        

        if(A==0){
            System.out.println(0);    
        }else if(A==1){
            System.out.println(1);   
        }else{
            System.out.println(ans); 
        }
    }
}
