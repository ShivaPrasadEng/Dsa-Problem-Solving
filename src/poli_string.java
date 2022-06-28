public class poli_string {
    public static void main(String[] args){
        String A="namana";
      //  System.out.print(A.charAt(1));
        int i=0;int j=A.length()-1;
        while(i<j){//1<3
            if(A.charAt(i)==A.charAt(j)) {//a=a
                System.out.print(A.charAt(i));
                System.out.println();
                System.out.print(A.charAt(j));
            }
            i++;//2
            j--;//2
            System.out.print(A.charAt(i));
            System.out.println();
            System.out.print(A.charAt(j));
        }
      //  System.out.print("false");
    }
}
