import java.util.*;
public class Araylists {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(10);
        arr.add(10);
        arr.add(1,20);
       // arr.clear();
        //arr.remove(1);
        for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");
         }
        if(arr.contains(20)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

        System.out.print(arr.indexOf(0));
        Object[] arr2=arr.toArray();
        String arr3=arr.toString();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.print(arr3);
    }
}
