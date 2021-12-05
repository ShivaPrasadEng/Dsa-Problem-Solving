//Percentage and Grade
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
    int B=sc.nextInt();
    int C=sc.nextInt();
    int D=sc.nextInt();
    int E=sc.nextInt();

    int per=(A+B+C+D+E)/5;

    if(per>=90){
        System.out.print(per+" "+"A");
    }else if(per>=80){
        System.out.print(per+" "+"B");
    }
    else if(per>=70){
        System.out.print(per+" "+"C");
    }
    else if(per>=60){
        System.out.print(per+" "+"D");
    }
    else if(per>=40){
        System.out.print(per+" "+"E");
    }
    else if(per<40){
        System.out.print(per+" "+"F");
    }

    }
}
