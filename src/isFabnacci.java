import java.util.*;
public class isFabnacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i=0;
        while(i<T){
            int inp=sc.nextInt();
            System.out.println(isFab(inp) ?  inp +  " is a Fibonacci Number" :
                    inp + " is a not Fibonacci Number");
            i++;
        }
    }


    static boolean isPer(int N){
        int s=(int)Math.sqrt(N);
        return(s*s==N);
    }
    static boolean isFab(int F){
        return isPer(5*F*F + 4) || isPer(5*F*F - 4);
    }
}
