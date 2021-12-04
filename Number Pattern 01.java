//

import java.lang.*;
import java.util.*;

//Electricity bill
public class javapr1 {
	public static void main(String[] args) {
		int N=4;
		int r=1;
		int v=1;
		while(r<=N) {//2<=4=>T
			int c=1;
			while(c<=r) {//1<=2=>T
				System.out.print(v);//1
				v=v+1;//2
				c=c+1;//2
			}
			System.out.println();
			r=r+1;//2
		}
		  
        }
	}
