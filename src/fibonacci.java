public class fibonacci {
    public static void main(String[] args) {
        int A = 13;
       // System.out.print(fabb(A));
        for(int i=0;i<=A;i++){
            System.out.print(fabb(i));
        }
    }
    static int fabb(int A) {
        if (A == 0) {
            return 0;
        } else if(A == 1){
            return 1;
        }else {
            int res= fabb(A - 1) + fabb(A - 2);
            return res;
        }
        }
    }

//0,1,1,2,3,5,8,13......
//1 2 3 4 5 6
//