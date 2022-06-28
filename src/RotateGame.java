import java.util.*;
public class RotateGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            int d=sc.nextInt();
            arr[i]=d;
        }
        int k=sc.nextInt();
        k=k%N;
        int[] A=reev(arr,0,N-1);
        int[] B=reev(arr,0,k-1);
        int[] C=reev(arr,k,N-1);
        //Reverse entier array
        //reverse array till K vale
        //reverse remainin array values after K value
        for(int i=0;i<C.length;i++){
            System.out.print(C[i]+" ");
        }

    }
    static int[] reev(int[] ar, int a, int b){
        int i=a;
        int j=b;
        int s=0;
        while(i<=j){
            s=ar[i];
            ar[i]=ar[j];
            ar[j]=s;
            i++;
            j--;
        }
        return ar;
    }
}
