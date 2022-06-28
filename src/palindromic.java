import java.util.*;

public class palindromic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=A;
        int s=0;
        while(A!=0){
            int d=A%10;
            s=s*10+d;
            A=A/10;
        }
        if(B==s){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
