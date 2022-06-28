import java.util.*;
public class BinaryLisst {
public static void main(String[] args) {
    ArrayList<Integer> am = new ArrayList<>();
    am.add(1);
    am.add(2);
    am.add(4);
    am.add(5);
    am.add(7);
    am.add(9);
    am.add(11);
    am.add(13);
    am.add(17);
    for(int i=0;i<am.size();i++){
       // System.out.println(am.get(i));
    }
    System.out.print(binarys(am,9));
}
static int binarys(ArrayList<Integer> arr, int key){
    int start=0;
    int end=arr.size()-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(arr.get(mid)==key){
            return mid;
        }else if(arr.get(mid)<end){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return -1;

}
}
