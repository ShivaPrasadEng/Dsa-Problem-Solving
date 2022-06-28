public class min_max {
    public static void main(String[] args){
        int[] arr={4,10,20,38,50};
        int a=arr[0];
        int b=arr[0];
        for(int i=1;i<arr.length;i++){
            if(a<arr[i]){//5<1
                a=arr[i];
            }
            if(b>arr[i]){
                b=arr[i];
            }
        }
        System.out.print(a+" "+b);
    }

}
