//Days In Month
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        switch(A){
            case 1:
                System.out.print(31);
                break;
            case 2:
                System.out.print(28);
                break;
            case 3:
                System.out.print(31);
                break;    
            case 4:
                System.out.print(30);
                break;  
            case 5:
                System.out.print(31);
                break;
            case 6:
                System.out.print(30);
                break;
            case 7:
                System.out.print(31);
                break;
            case 8:
                System.out.print(31);
                break;
            case 9:
                System.out.print(30);
                break;    
            case 10:
                System.out.print(31);
                break;  
            case 11:
                System.out.print(30);
                break;
            case 12:
                System.out.print(31);
                break;    
        }


    }
}
