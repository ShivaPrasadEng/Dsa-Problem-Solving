//Prime Numbers BW Range
import java.lang.*;
import java.util.*;


public class sp_02 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt();//10
		int B=sc.nextInt();//20
		int N=A;
		for(;N<=B;N++)
		{
			int i=2;
			while(i<=N-1) {
				//System.out.print(i);
				if(N%i==0) {
					//System.out.println("Not Prime");
					break;
				}
				i=i+1;
			}
			if(i==N) {
				System.out.println(N);
			}	

        }

		
	}
	}
