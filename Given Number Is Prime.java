//Given Number Is Prime

import java.lang.*;
import java.util.*;


public class sp_02 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt();
		int i=2;
		while(i<=A-1) {//2<=1
			if(A%i==0) {
				System.out.print("Not Prime");
				//break;
			}
			i=i+1;
		}
		if(A==i) {
			System.out.print("Prime");
		}
			
        }
	}

/*
n=4;
2 to n-1
*/
