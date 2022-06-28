public class powwer {
    public static void main(String args[]){
       // System.out.print(pow_two(2,3));
        int value=010;
        int sum=0;
        int j=0;
        while(value!=0){
            int digit=value%10;
            sum=sum+(digit*pow_two(5,j));
            value=value/10;
            j++;
        }
        System.out.println(sum);
        System.out.println(decimal_binary(12));
    }
    static int pow_two(int value,int n){
        int sum=1;
        int i=1;
        while(i<=n){
            sum=sum*value;
            i++;
        }
        return sum;
    }
    static int decimal_binary(int A){
        int sum=5;
        int ans=0;
        int i=0;
        while(A!=0){//3!=0
            int d=A%2;//3%2=>1
            ans=ans+(d*sum);//ans=100
            sum=sum*10;//10*10
            A=A/2;//3
            i++;//2
        }
        return ans;
    }
}
