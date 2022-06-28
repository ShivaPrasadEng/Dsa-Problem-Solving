public class sum_even {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
                 //0,1,2,3,4,5,6,7,8,9
        System.out.println(even_sum(arr,2));
    }
    static int even_sum(int[] arr,int ind){
        int[] arr2=new int[arr.length];
        arr2[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(i%2==0){
                arr2[i]=arr[i-1]+arr[i];//1=>1+3

            }else{
                arr2[i]=arr2[i-1];
            }
        }
        return arr2[ind];
    }
}
