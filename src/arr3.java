import java.util.*;
public class arr3 {
    public static void main(String args[]){
    ArrayList<Integer> List=new ArrayList<>();
    List.size();
    List.add(1);
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int[] arr=new int[A];
    int[] arr2=new int[A+1];
    int r=18;
    for(int i=0;i<arr.length;i++){
        int inp=sc.nextInt();
        arr[i]=inp;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]==18){
            //arr2[i]=i;
            System.out.println(i);
        }
    }

    for(int i=0;i<arr2.length;i++){
        System.out.println(arr2[i]);
    }

    }

}

