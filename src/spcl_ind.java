public class spcl_ind {
    public static void main(String[] args){
            int[] arr={15,-1,7,2,5,4,2,3};
            int n=arr.length;
            int max=arr[n-1];
            int count=1;
            for(int i=n-2;i>=0;i--){
                if(arr[i]>max){
                    max=arr[i];
                    count++;
                }
            }
            System.out.println(count);
    }
}
