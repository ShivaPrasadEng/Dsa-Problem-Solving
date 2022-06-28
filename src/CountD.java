import java.util.*;
public class CountD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int j = 1;
            int d = 0;
            while (A != 0) {
                d = j;
                j = j + 1;
                A = A / 10;
            }
            System.out.println(d);
        }
    }

}