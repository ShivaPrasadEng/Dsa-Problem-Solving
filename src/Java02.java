public class Java02 {
    public static void main(String args[]){
        int n=5;

        /*
        1
        2 3
        4 5 6
        7 8 9 10
         */
        int c=1;
        for(int i=1;i<=n;i++){//1,2,3,4,5

            for(int j=1;j<=i;j++){//
                System.out.print(c);
                c=c+1;
               // c=j;
            }
            System.out.println();
        }
    }
}
