public class jaggadroute {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0;i<arr.length;i++){//0,1,2
           if(i%2==0){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[j][i]);
                }
           }else{
               for(int j=arr.length-1;j>=0;j--){//3
                   System.out.print(arr[j][i]);
               }
           }
        }
    }
}
