public class sortt {
    public static void main(String[] args){
        int[][] arr={{1,2},{3,4}};

        for(int i=0;i<arr.length;i++){//0,1
            for(int j=0;j<arr[i].length;j++){//0,1
                arr[i][j]=arr[j][i];//arr[0][0]=arr[0][0]
            }
        }

     /*   for(int i=0;i<arr.length;i++){
            int start=0;
            int end=arr[i].length-1;
            while(start<end){//0<1
                int temp=arr[i][start];//1
                arr[i][start]=arr[i][end];//2
                arr[i][end]=temp;//1
                start++;//1
                end--;//0
            }
        }*/

        // Traverse each row of arr[][]

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
