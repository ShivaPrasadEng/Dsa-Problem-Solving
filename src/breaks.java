public class breaks {
    public static void main(String[] args){
        int c=1;
        boolean b=true;
        while(c<=20){
          //  System.out.println(c);
            if(b && c==10){
                return;
            }
            System.out.println(c);
            c=c+1;

        }

    }
}
