public class primeFact {
    public static void main(String[] args){
        int A=44;
        //36/2
        //18//2
        //9/3
        //3/3
        int i=2;
        while(A>1 && i*i<=A){//18>1 &&
            if(A%i==0){//36%2==0
                System.out.println(i);
                A=A/i;//36/2=18;
            }else{
                i++;//3
            }
        }
        if(A!=1){
            System.out.println(A);
        }
    }
}
