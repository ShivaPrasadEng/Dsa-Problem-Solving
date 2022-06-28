public class GoodPair {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int B=8;
        System.out.print(is_good(arr,B));
    }
    public static int is_good(int[] arr, int B){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                else{
                    if(arr[i]+arr[j]==B){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
