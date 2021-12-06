//decimal to binnary
import java.lang.*;
import java.util.*;


public class sp_02 {
	static long decimalToBanary(int N){//1011
//converting decimal to binary
		//11(1011)
		//11/2=>5=>1
		//5/2=>2=>1
		//2/2=>0=>0
		//0/2=>0=>1
		int i=0;
		int d=0;
		int b=0;//11
		while(N>0) {//1>=0
			d=N%2;//1%2=>1
			b=(int)(b+d*Math.pow(10,i));//11+1*1000=>1011
			N=N/2;//1/2=>0
			i=i+1;
		
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		long res=decimalToBanary(A);
		System.out.println(res);
    }
		
}

/*
n=4;	
2 to n-1
*/

