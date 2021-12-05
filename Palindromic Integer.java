//Palindromic Integer
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
      Scanner sc=new Scanner(System.in);
      int A=sc.nextInt();//123
      int sum=0;
      int i=A;
        while(i!=0){
            int d=i%10;//3
            sum=sum*10+d;
            i=i/10;
        }
        //System.out.print(sum);
        if(A==sum){
            System.out.print("Yes");
        }else
            System.out.print("No");

    }
}
