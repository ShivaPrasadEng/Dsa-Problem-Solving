import java.util.*;
public class arr2 {
    public static void main(String[] args){
        //int N=5;

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            int inp=sc.nextInt();
            arr[i]=inp;
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
