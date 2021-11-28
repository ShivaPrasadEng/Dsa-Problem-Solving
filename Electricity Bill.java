//Electricity Bill
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
      double amt=0;

    if(A<=50){
        amt=0.5*A;
    }else if (A<=150){
        amt=0.5*50+0.75*(A-50);
    }else if(A<=250){
        amt=0.5*50+0.75*100+1.20*(A-150);
    }else{
        amt=0.5*50+0.75*100+1.20*100+1.50*(A-250);
    }
    amt=(amt+0.2*amt);
    int ans=(int)amt;
    System.out.println(ans);

      

    }
}
