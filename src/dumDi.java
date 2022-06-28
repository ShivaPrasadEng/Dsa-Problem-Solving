public class dumDi {
    public static void main(String[] args){
        int A=36;
        int s=0;
        for(int i=1;i*i<=A;i++) {
            if (A%i==0) {
                if ((i * i) == A) {
                    s = s + i;
                } else {
                    s = s + (i + A / i);
                }
            }
        }
        System.out.print(s);
    }
}
