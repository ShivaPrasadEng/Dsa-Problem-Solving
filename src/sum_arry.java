public class sum_arry {
    public static void main(String[] args){
      //  int[] arr={-3,6,2,4,5,2,8,-9,3,1};
        int[] arr={3,-1,2,-1,1,2,1};
        //System.out.print(sum_arry(arr,2,5));
        //int[] arr2=pref_sum(arr);
        //int[] arr2= pf_even(arr);
      int arr2= is_spacial(arr);
       /* for(int i=0; i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }*/
       // System.out.println("Left: "+arr2[2]);
        //System.out.println("Right: "+arr2[2]);
        //System.out.println("Right: "+equlib(arr));
     //  System.out.println("Right: "+arr2[3]);
        System.out.println("Right: "+arr2);
    }
    static int is_spacial(int[] arr){
        int even=0;
        int odd=0;
        int cnt=0;
        int[] ar_even=pf_even(arr);
        int[] ar_odd=pf_odd(arr);
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(i==0){
             even=0+(ar_odd[n-1]-ar_odd[i]);
             odd=0+(ar_even[n-1]-ar_even[i]);
            }else{
                even=ar_even[i-1]+(ar_odd[n-1]-ar_odd[i]);
                odd=ar_odd[i-1]+(ar_even[n-1]-ar_even[i]);
            }
            if(even==odd){
                cnt= i;
            }
        }
return cnt;
    }
    static int[] pf_odd(int[] arr){
        int[] pf_odd=new int[arr.length];
        pf_odd[0]=0;
        for(int i=1;i<arr.length;i++){
            if(i%2==1){
                pf_odd[i]=pf_odd[i-1]+arr[i];
            }else{
                pf_odd[i]=pf_odd[i-1];
            }
        }
        return pf_odd;
    }
    static int[] pf_even(int[] arr){
        int[] pf_arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i%2==0) {
                if (i == 0) {
                    pf_arr[i] = arr[i];//0=>3
                } else {
                    pf_arr[i] = arr[i] + pf_arr[i - 1];//2=>4+3
                }
            }else {
                pf_arr[i]=pf_arr[i-1];//1=>3
            }
        }
        return pf_arr;
    }
  static int equlib(int[] arr){
        int sum=0;
        int left=0;
        int right=0;

        int[] eqb=pref_sum(arr);
      int n=eqb.length;
        for(int i=0;i<n;i++){
            if(i==0){
                left=0;
            }else{
                left=eqb[i-1];
            }
            if(i==n-1){
                right=0;
            }else{
                right=eqb[n-1]-eqb[i];
            }
            if(left==right){
                sum++;
            }
        }
        return sum;
  }

    static int sum_arry(int[] arr,int l,int r){
        int sum=0;
        for(int i=l; i<r;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    static int[] pref_sum(int[] arr){
        int[] arr2=new int[arr.length];
        arr2[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr2[i]=arr[i]+arr2[i-1];
        }
        return arr2;
    }
}
