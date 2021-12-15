//Factorial with Recursion
 import java.lang.*;
import java.util.*;


public class sp_02 {
	static int getFact(int n) {
		//base condition
		if(n==0) {
			return 1;
		}else {
		int ans =getFact(n-1)*n;
		return ans;
		}
	} 
	
	public static void main(String[] args) {
		int n=9;
		System.out.println(getFact(n));
    }
		
}




