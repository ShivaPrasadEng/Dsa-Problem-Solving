public class spacial_indx {
    public static void main(String[] args){
        int[] arr3={1,2,3,4,5,6,7,8,9,10};
        int[] res=pf_odd(arr3);
        for(int j=0;j<res.length;j++){
            System.out.println(res[j]+" ");
        }
    }
    static int[] pf_even(int[] arr){//1,1,
        int res=0;
        int[] arr4=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           if(i%2==0) {
               if (i == 0) {
                   arr4[i] = arr[i];
               } else {
                   arr4[i] = arr[i]+arr4[i-1];
               }
           }else{
               arr4[i]=arr4[i-1];
           }
        }
        return arr4;
    }
    static int[] pf_odd(int[] arr){
        int[] arr5=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i%2==1){
                if(i==1) {
                    arr5[i] = arr[i];
                //    arr5[i-1] = arr[i];
                }else{
                    arr5[i] = arr[i]+arr5[i-1];
                }
            }else{
                arr5[i]=arr5[i-1];
            }
        }
        return arr5;
    }
    static int[] pf_sum(int[] arr){
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==0){
                arr2[i]=arr[i];
            }else{
                arr2[i]=arr[i-1]+arr[i];
            }
        }
        return arr2;
    }

}
