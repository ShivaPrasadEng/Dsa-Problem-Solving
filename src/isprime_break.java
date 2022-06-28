import java.util.*;
public class isprime_break {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int i=A;//10
        while (i<=B) {//10<=20
            int j=2;
            while(j<i){//2<10
                if(i%j==0){//10%2==0
                    //  System.out.print("Not Prime");
                    break;
                }
                j=j+1;//3
            }
            if(i==j){
                System.out.println(i);
            }
            i=i+1;
        }


    }
}
