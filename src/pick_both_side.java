public class pick_both_side {
    public static void main(String[] args){
    int[] arr={5, -2, 3 , 1, 2};
    System.out.println(pick_both(arr,3));
    }
 static int pick_both(int[] arr, int B){
        int sum=0;
        int ans=0;
        int n=arr.length;
        for(int i=0;i<B;i++){
            sum=sum+arr[i];
        }
        ans=sum;
        int j=B-1;
        int k=n-1;
        while(j>=0){
         sum=sum-arr[j]+arr[k];
         ans=max_v(ans,sum);
            j--;
            k--;
        }
        return ans;
 }
 static int max_v(int M, int N){
        if(M>N){
            return M;
        }else{
            return N;
        }
 }
}
