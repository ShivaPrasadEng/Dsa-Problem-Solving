//Is It Prime
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
        //
        int r=0;
        for(int i=2;i<A;i++){
            if(A%i==0){
                r=1;
                //break;
            }
        //System.out.println("YES");
            
        }
         if (r==1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        
    }
}
