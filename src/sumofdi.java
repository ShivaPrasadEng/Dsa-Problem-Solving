import java.util.*;
public class sumofdi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int inp=sc.nextInt();
            int s=0;
            while(inp>0){
                int d=inp%10;
                s=s+d;
                inp=inp/10;
            }
            System.out.println(s);
        }
    }
}
