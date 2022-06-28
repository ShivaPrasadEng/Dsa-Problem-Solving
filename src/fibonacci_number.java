import java.util.*;
public class fibonacci_number {
    public static void main(String[] args){
      /*  ArrayList<Integer> List=new ArrayList<Integer>();
        List.add(0,0);
        List.add(1,1);
        int value1=List.get(0);
        int value2=List.get(1);

        int i=2;
        while(i<=45){//2<45
            int value3=value1+value2;
            List.add(value3);
            value1=value2;
            value2=value3;
            i++;
        }
        for(int x:List){
            //System.out.println(x);
        }*/
        System.out.println(fab_numbers());
        System.out.println(loc_fab(701408731));
    }
    static String loc_fab(int num){
        for(int i=0;i<fab_numbers().size();i++){
            if(fab_numbers().get(i)==num){
                return "Yes";
            }
        }
        return "No";
    }
 static ArrayList<Integer> fab_numbers(){
     ArrayList<Integer> List=new ArrayList<Integer>();
     List.add(0,0);
     List.add(1,1);
     int value1=List.get(0);
     int value2=List.get(1);

     int i=2;
     while(i<=45){//2<45
         int value3=value1+value2;
         List.add(value3);
         value1=value2;
         value2=value3;
         i++;
     }
     return List;
    }
}
