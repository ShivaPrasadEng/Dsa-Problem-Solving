import java.util.Scanner;
public class Java01 {
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        Scanner St=new Scanner(System.in);
        //System.out.println("Hello");
        //int a=10;
        //float b=30.43f;
        //int c=a+(int)b;
        //float d=c;
        int A=S.nextInt();
        int B=S.nextInt();
        String Str=St.nextLine();
        System.out.println(A);
        System.out.println("The Result is "+A);
        System.out.println(Str);
        /*if(A>B){
            System.out.print(A+" is bigger");
        }else{
            System.out.print(A+" is smaller");
        }*/
        if(A<15){
            System.out.print("Cold");
        }else if(A>15 && A< 25){
            System.out.print("present");
        }else{
            System.out.print("Hot");
        }
    }
}
