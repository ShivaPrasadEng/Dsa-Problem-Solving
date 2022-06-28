import java.util.*;
public class lengthMinMax {
    public static void main(String[] args){
        int[] arr={2,2,6,1,1,1,5,2,6,4,3,4,1};
        //System.out.println(is_min(arr));
        //System.out.println(is_max(arr));
        //System.out.println(min_max(arr));
        System.out.println(min_max2(arr));

    }
    static int min_max2(int[] arr){
        int n=arr.length;
        int max_i=-1;
        int min_i=-1;
        int len=0;
        int ans=n;
        int min=is_min(arr);
        int max=is_max(arr);
        for(int i=n-1;i>=0;i--){
            if(arr[i]==min){
                min_i=i;//[max-min]
                if(max_i != -1) {
                    len = max_i - min_i;
                    ans = Math.min(ans, len);
                }
            }else if(arr[i]==max){
                max_i=i;//[min-max]
                len=min_i-max_i;
                ans=Math.min(ans,len);
            }
        }
        return ans;
    }
    static int min_max(int[] arr){
        int min=is_min(arr);
        int max=is_max(arr);
        int ans=arr.length;
        if(min==max){
            return 1;
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==min){
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[j]==min){
                            break;
                        }else if(arr[j]==max){
                            ans=Math.min(ans,j-i+1);
                            break;
                        }
                    }
                }else if(arr[i]==max){
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[j]==max){
                            break;
                        }else if(arr[j]==min){
                            ans=Math.min(ans,j-i+1);
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
    static int is_min(int[] arr){
        int in=arr[0];
        for(int i=1;i<arr.length;i++){
            if(in>arr[i]){
                in=arr[i];
            }
        }
        return in;
    }
    static int is_max(int[] arr){
        int in=arr[0];
        for(int i=1;i<arr.length;i++){
            if(in<arr[i]){
                in=arr[i];
            }
        }
        return in;
    }
}
