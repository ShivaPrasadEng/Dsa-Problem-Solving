public class addFive {
    public static void main(String args[]){
        System.out.println(abc(10));
    }
    public static int abc(int A) {//3
        int[] arr=new int[A];//0,1,2,3
        //int i=0;
        int a=5;
        arr[0]=a;//5
        int b=a*a;//25
        arr[1]=b;//25
        for(int i=2;i<arr.length;i++){//2,
            if(i%2==0){
                arr[i]=arr[i-1]+a;//30
            }else{
                arr[i]=b*a;
                b=arr[i];
            }
        }
        return arr[A-1];
    }
}
