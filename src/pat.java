public class pat {
    public static void main(String[] args){
   //System.out.print((char)65);
        int a=65;
    for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++) {
            System.out.print((char) a);
            if(i!=j){
                System.out.print(" ");
            }

        }
        a++;
        System.out.println();

    }

    }
}
