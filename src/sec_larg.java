public class sec_larg {
    public static void main(String[] args) {
        int[] arr2 = {1};
        int max = sec_larg(arr2);
        int start = arr2[0];
        if (arr2.length > 1) {
            for (int j = 1; j < arr2.length; j++) {
                if (j != max) {
                    if (start < arr2[j]) {
                        start = arr2[j];
                    }
                }
            }
            System.out.println(start);
        }else{
            System.out.println(-1);
        }
    }
    static int sec_larg(int[] arr) {
        int ind = 0;
            int start = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (start < arr[i]) {
                    ind = i;
                    start = arr[i];
                }
            }
            return ind;
        }
}
