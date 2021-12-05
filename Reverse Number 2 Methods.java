//Revers Number in 2 methods

import java.lang.*;
import java.util.*;


public class sp_02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		
		//System.out.println();
		int d=0;
		//jugad method
		while(A!=0) {
			d=A%10;
			System.out.print(d);
			A=A/10;
		}
		System.out.println();
		//actul method
		int s=0;//2
		//int d1=0;
		while(A!=0) {//1
			int d1=A%10;//1
			s=s*10+d1;//21
			A=A/10;//1
		}
		System.out.print(s);
	}
	}
