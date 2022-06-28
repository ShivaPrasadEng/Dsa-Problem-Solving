import java.util.*;

public class monthnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        switch(A){
            case 1:
                System.out.print(31);
                break;
            case 2:
                System.out.print("28/29");
                break;
            case 3:
                System.out.print(30);
                break;
            default:
                System.out.print("No Data");
        }
    }
}
