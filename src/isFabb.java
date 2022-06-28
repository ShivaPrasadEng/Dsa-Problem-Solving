public class isFabb {
    public static void main(String args[]){
    //System.out.println(isfab(5));
    //System.out.println(isfact(100));
int A=3125;
int pow=5;
int sum=0;
        while(pow<=A){
            sum=sum+A/pow;
            pow=pow*5;
        }
System.out.print(sum);
}
static int isfab(int a){
int zero=0;
int one=1;
int two=0;
int i=2;
while(i<=a){
    two=zero+one;
    zero=one;
    one=two;
    i++;
}
return two;//0,1,1,2,3,5
}
static long isfact(int input){
        int i=1;
        long sum=1;
        while(i<=input){
            sum=sum*i;
            i++;
        }
        return sum;
}
}
