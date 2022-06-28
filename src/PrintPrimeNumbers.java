public class PrintPrimeNumbers {
    public static void main(String args[]){
        if(isPrime(4)){
         //   System.out.print("Not Prime");
        }else{
           // System.out.print("Prime");
        }
        for(int j=10;j<=20;j++){
            if(isPrime(j)){
                System.out.print(j+" ");
            }
        }
    }
public static boolean isPrime(int A){
    for(int i=2;i<A;i++){
        if(A%i==0){
            return false;
        }
    }
    return true;
}
}
