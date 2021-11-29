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
       //234 => A%10, A/10
     while(T!=0) {   
        int d=0;
        int sum=0;
        int A=sc.nextInt();
      while(A!=0){ //234,23,2
          d=A%10; //4,3,2
          sum=sum*10+d;//4,43,32
          A=A/10;//23,2
      }
    System.out.println(sum);
    T--;
    }
}
}
