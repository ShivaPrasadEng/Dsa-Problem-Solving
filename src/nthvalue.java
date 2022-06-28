import java.util.*;
public class nthvalue {
    public static void main(String args[]){
        int value=5;
        int pow=1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        int endValue=10;
        int i=1;
        while(i<=endValue){
            list.add(poww(value,i));
            i++;
        }

        for(int j=0;j<list.size();j++) {
           // System.out.println(list.get(j));
            int k=0;
            while(k<j){
                System.out.println(list.get(j));
            }
        }
    }
    static int poww(int value, int pValue){
        int pow=value;//2
        int i=1;
        while(pValue>i){//3>1
            pow=pow*value;//4
            i++;//
        }
        return pow;
    }
}
