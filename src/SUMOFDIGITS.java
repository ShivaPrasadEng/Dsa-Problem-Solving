public class SUMOFDIGITS {
    public static void main(String args[]){
        int N=12340;
        int digit=0;
        int sum=0;
        while(N>0){
            digit=N%10;
            sum=sum+digit;
            N=N/10;
        }
        System.out.print(sum);
    }
}
