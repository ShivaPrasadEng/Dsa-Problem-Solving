public class asc_des {
    public static void main(String[] args){
        desc(5);
        asc(5);
    }
    static void desc(int a){
        if(a==0){
            return;
        }else{
            System.out.println(a);
            desc(a-1);
        }
    }
    static void asc(int a){
        if(a==0){
            return;
        }else{
            asc(a-1);
            System.out.println(a);
        }
    }

}