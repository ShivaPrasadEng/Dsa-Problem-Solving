public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 9, 4};

        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            for(int j=1;j<arr.length;j++){
                int s=0;
                if(arr[i]>arr[j]){//5>3
                   s=arr[i];//5
                   arr[j]=arr[i];//3
                   arr[j]=s;//5
                }
            }
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}
