//Is Prime Number with Function
import java.lang.*;
import java.util.*;


public class sp_02 {
	static boolean isPrime(int N) {//5
		for(int i=2;i<N;i++) {//2
			if(N%i==0) {
			return false;	
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		if(isPrime(A)) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
    }
		
}

/*
n=4;	
2 to n-1
*/
