import java.util.*;
public class sum_valu {
    public static void main(String[] args){
    int[] arr={0,1,2,3,4,5,6,7,8,9};//{0,1,3,6,10,15,21,28,36,45}
        Scanner sc=new Scanner(System.in);
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            int one =sc.nextInt();
            int two=sc.nextInt();
            if(one==0){
                     System.out.println(sum_array(arr,two));
            }else{
                int ans=sum_array(arr,two)-sum_array(arr,one-1);
                System.out.println(ans);
            }
        }
    //System.out.print(sum_array(arr,4));

    }
    static int sum_array(int[] arr,int input){
        int[] arr2=new int[arr.length];
        int start= arr[0];
        arr2[0]=arr[0];
        for(int i=1;i<arr.length;i++){//2,3,4
            arr2[i]=start+arr[i];//1+2
            start=arr2[i];//3
        }

        return arr2[input];
    }

}
