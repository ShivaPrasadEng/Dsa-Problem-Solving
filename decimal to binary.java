//decimal to binary
import java.lang.*;
import java.util.*;


public class sp_02 {
	static void decimalToBanary(int N){//1011
//converting decimal to binary
		//11(1011)
		//11/2=>5=>1
		//5/2=>2=>1
		//2/2=>0=>0
		//0/2=>0=>1
		long d=0;
		while(N!=0) {//11>=0
			d=N%2;//11%2=>1
			System.out.print(d);
			N=N/2;//11/2=>5
		}
		//return d;

	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int A=sc.nextInt();
		//long res=decimalToBanary(A);
		//System.out.println(res);
		decimalToBanary(3);
    }
		
}

/*
n=4;	
2 to n-1
*/
