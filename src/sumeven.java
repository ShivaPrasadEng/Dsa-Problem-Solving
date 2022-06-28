public class sumeven {
    public static void main(String[] args){
        int A=1;
        int B=5;
        int sum=0;
        for(int i=A;i<=B;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.print(sum);
    }
}
