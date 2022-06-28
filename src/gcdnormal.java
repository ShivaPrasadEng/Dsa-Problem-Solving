import java.util.*;
import java.math.*;
public class gcdnormal {
    public static void main(String args[]){
        int value1=22;
        int value2=42;
        int max=Math.max(value1,value2);//91
        int min=Math.min(value1,value2);//21
        int copy_min=min;//21
        while(max%min >0){//20%22!=0
            copy_min=min;//22
            min= max-((max/min)*min);//42-(1*22)=>20
            max=copy_min;//20
        }
       System.out.println(min);
    }
}
