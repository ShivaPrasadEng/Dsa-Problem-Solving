public class equil_index {
public static void main(String[] args){
    int[] arr={3,-1,2,-1,1,2,1};

    //index value
    //left
    //right
    int left=0;
    int right=0;
    for(int i=0;i<arr.length;i++) {
 if(i==0){
        left=0;
        right=sum_val(arr,i,(arr.length-1));
        //System.out.println(left+" "+right);
    }
    else if(i==(arr.length-1)){
        left = sum_val(arr, 0, i - 1);
        right=0;
        //System.out.println(left+" "+right);
    }
    else{
        left = sum_val(arr, 0, i - 1);
        right=sum_val(arr,i+1,(arr.length-1));
        // System.out.println(left+" "+right);
    }
    if(left==right){
        System.out.println(i);
    }
    }
    //System.out.println(sum_val(arr,0,0));

}

    static int sum_val(int[] arr,int ind1, int ind2){
        int sum=0;
        for(int i=ind1;i<=ind2;i++){
            sum=sum+arr[i];
        }
        return sum;
    }



}
