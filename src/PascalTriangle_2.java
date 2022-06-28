public class PascalTriangle_2 {
public static void main(String[] args){
    //ncr => n!/r!(n-r)!
    for(int line=0;line<14;line++){
        for(int row=0;row<=line;row++){
            long res=is_fact(line)/(is_fact(row)*is_fact(line-row));//
            System.out.print(res);
        }
        System.out.println();
    }
}
    static long is_fact(int a){
        int i=1;
        long sum=1;
        while(i<=a){
            sum=sum*i;
            i++;
        }
        return sum;
    }
}
