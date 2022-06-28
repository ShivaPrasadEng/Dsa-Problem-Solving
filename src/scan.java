import java.util.*;
public class scan {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
       // System.out.print(A);
        float unit=0;
        if(A>=50){//150
            unit=unit+25;//25
            A=A-50;//100
            if(A>=100){
                unit=unit+75;//100
                A=A-150;
                if(A>=100){
                    unit=unit+120;
                    A=A-250;
                    if(A>250){
                        unit=unit+(int)(A*1.50);
                    }
                }
                else{
                    unit=unit+(int)(A*1.20);//25
                }
            }else{
                unit=unit+(int)(A*0.75);//25
            }
        }else{
            unit=unit+(int)(A*0.25);//25
        }
        System.out.print(unit);
    }
}
