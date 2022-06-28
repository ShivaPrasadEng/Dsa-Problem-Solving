public class gcd3 {
    public static void main(String args[]){
        int a=20;
        int b=30;
        int arr[] = {36, 10, 20, 50, 4};
        //int g=0;

        //System.out.println(g);
        for(int i=2;i<arr.length;i++){//
        //System.out.println(isGCD(arr[i],arr[i+1]));//2
            int g=isGCD(arr[0],arr[1]);
            g=isGCD(g,i);
            System.out.println(i+" "+g);
        }
       // System.out.print(g);
    }
    static int isGCD(int x, int y){
        if (x==0){
            return y;
        }
        return isGCD(y%x,x);
    }
}
