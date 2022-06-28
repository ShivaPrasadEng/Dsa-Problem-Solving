public class kadaneAlgo {
    public static void main(String[] args){
    String nam="AnaConDa";
    char[] arr=nam.toCharArray();
    for(int i=0;i<arr.length;i++){
      //  System.out.print((char)(arr[i]^32)+" ");
        //System.out.println();
        if(arr[i]>=65 && arr[i]<=90) {
            //char A= (char) (arr[i]+32);
            System.out.print((char)(arr[i]+32) + " ");
        }else{
            System.out.print((char)(arr[i] - 32) + " ");
        }
    }
    }
}
