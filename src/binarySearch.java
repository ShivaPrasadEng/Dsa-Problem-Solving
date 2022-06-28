public class binarySearch {
    public static void main(String args[]){
        int A=11;

        int i=2;
        int sum=1;
        while(A>1){
            if(A%i==0){
                sum=sum*i;
                System.out.println(i);
                A=A/i;
            }else{
                i=i+1;
            }
        }
        System.out.println(sum);
    }
}
