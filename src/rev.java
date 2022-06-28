public class rev {
    public static void main(String[] args){
        int A= -25604;
        int s=0;
        while(A!=0){
            int d=A%10;
           s=(s*10)+d;
           // System.out.print(d);
            A=A/10;
        }
        System.out.print(s);
    }
}
