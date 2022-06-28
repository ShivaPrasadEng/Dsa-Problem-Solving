import java.util.*;
public class isprime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        //System.out.print(isPrime(9));
        //System.out.print(isPrime(7));
        //System.out.print(isPrime(4));
        if(isPrime(c)){
            System.out.print("Yes");
      }else{
            System.out.print("No");
       }
    }
    public static boolean isPrime(int A){//9
        for(int i=2;i*i<=A;i++){//4<9
            if(A%i==0){//7%4
                return false;
            }
        }
        return true;
    }

}
