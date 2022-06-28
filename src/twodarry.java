public class twodarry {
    public static void main(String[] args) {
        int[][] arra = tod();
        for (int i = 0; i < arra.length; i++) {
            for (int j = 0; j < arra[i].length; j++) {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] tod(){
        int[][] arr=new int[2][2];
    for(int i=0;i<arr.length;i++){//0,1
        for(int j=0;j<arr[i].length;j++){//2
            arr[i][j]=i+j;//0+1
        }
    }
        return arr;
    }
}
