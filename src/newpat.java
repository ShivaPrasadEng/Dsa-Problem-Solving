
public class newpat {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
                if(i!=j){
                   // System.out.print(" ");
                }
            }
            for(int k=0;k<i;k++){
                System.out.print(k+i+" ");
                if(i!=k){
                   // System.out.print(" ");
                }
            }
            for(int l=1;l<i;l++){
                System.out.print(l+1+" ");
            }
            System.out.println();
        }
    }
}
