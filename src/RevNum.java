public class RevNum {
    public static void main(String[] args){
        int A=2546;
        int rev=0;
        while(A!=0){
            int d=A%10;
            rev= rev*10+d;
            A=A/10;
        }
        System.out.print(rev);
    }
}
