public class sumiofD {
    public static void main(String[] args){
        int A=30;
        //36->1,2,3,4,6,9,12,18,36
        //1*36
        //2*18
        //3*12
        //4*9
        //6*6
        //9*4
        //12*3
        //18*2
        //36*1
        //A=> N,A/N
        //Sum=N+A/N
        int sum=0;
        for(int i=1;i*i<=A;i++){
            if(A%i==0){
                if(i*i==A) {
                    sum = sum + i;
                    System.out.println(i);
                }else{
                    sum=sum+(i+(A/i));
                    System.out.println(i);
                    System.out.println(A/i);
                }
            }
        }
        //System.out.print(sum);
    }
}
