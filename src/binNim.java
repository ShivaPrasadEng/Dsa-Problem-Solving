public class binNim {
    public static void main(String args[]){
        //Trailing zeros
        int c=0;
        int number=8;
        int i=0;
        int p=1;
        while(number>0){//18
            int d=number%2;//0
            if (d==0){//0
                c=c+1;//1
                number=number/2;//9
            }else{
                break;
            }
            //System.out.println(c);
        }
        System.out.println(c);
    }
}
