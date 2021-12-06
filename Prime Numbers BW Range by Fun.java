//Prime Numbers BW Range by Function
import java.lang.*;
import java.util.*;


public class sp_02 {
	//is prime or not
	static boolean isPrime(int N) {//5
		for(int i=2;i<N;i++) {//2
			if(N%i==0) {
			return false;	
			}
		}
		return true;
	}
	
	//prime numbers b/w range
	static void rangePrime(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int A=sc.nextInt();
		if(isPrime(A)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		//ternary operator
		String res=isPrime(A)?"Yes":"No";
		System.out.println(res);*/
		//range prime
		int A=sc.nextInt();
		int B=sc.nextInt();
		rangePrime(A,B);
    }
		
}

/*
n=4;	
2 to n-1
*/
