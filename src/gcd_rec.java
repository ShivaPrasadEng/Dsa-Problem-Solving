public class gcd_rec {
    public static void main(String args[]){
        //System.out.println(is_rec(10,20));

        int[] arr={10,20,30,40};
        int gcd = is_rec(arr[0],arr[1]);
        int i=2;
        while(i<arr.length){
            gcd=is_rec(gcd,arr[i]);
            i++;
        }
        System.out.println(gcd);
    }
    static int is_rec(int value1, int value2){//10,20
        if(value1==0){//20
            return value2;
        }
        return is_rec(value2%value1,value1);//
    }
}
