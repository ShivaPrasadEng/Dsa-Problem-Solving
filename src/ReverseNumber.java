public class ReverseNumber {
    public static void main(String args[]){
        int N=12340;
        int digit=0;
        int rev=0;
        while(N>0){
            digit=N%10;//4
            rev=(rev*10)+digit;
            N=N/10;
        }
        System.out.print(rev);
    }
}
