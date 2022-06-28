import java.util.*;
public class fabonacci2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(isFab(A));
    }
    static int isFab(int N){

        if(N==0){
            return 0;
        }else if(N==1){
            return 1;
        }else{
            return isFab(N-1)+isFab(N-2);//
        }
    }


}
