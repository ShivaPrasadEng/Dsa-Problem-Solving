import java.util.*;
public class isfab2 {
    public static void main(String args[]){
       /* Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i=0;
        while(i<T){
            int inp=sc.nextInt();
            System.out.println(isFibonacci(inp) ?  inp +  " is a Fibonacci Number" :
                    inp + " is a not Fibonacci Number");
            i++;
        }*/
        //for (int i = 1; i <= 100; i++)
            System.out.println(isFibonacci(317811) ?  317811 +  " is a Fibonacci Number" :
                    317811 + " is a not Fibonacci Number");
    }
    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n)
    {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }
}
