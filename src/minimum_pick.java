public class minimum_pick {
    public static void main(String[] args){
        int[] arr={-1, 2, 9};
        System.out.println(max_even(arr));
    }
    static int max_even(int[] arr){
        int max=-1000000000;//5
        int min=1000000000;//5
        for(int i=0;i<arr.length;i++){//17,100,1
            if(arr[i]%2==0){//
               if(max<arr[i]){//5<100
                    max=arr[i];//100
               }
            }else{
               if(min>arr[i]){//5>1
                   min=arr[i];
               }
            }
        }
        return max-min;
    }
}
