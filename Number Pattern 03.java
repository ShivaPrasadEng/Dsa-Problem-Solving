/*
   *
  ***
 *****
*******
*/
import java.lang.*;
import java.util.*;

//Electricity bill
public class javapr1 {
	public static void main(String[] args) {
		int N=3;
		int r=1;
		while(r<=N) {//2<3=>T
			//spaces
			int s=1;
			while(s<=N-r){//3<=2
				System.out.print(" ");
				s=s+1;
			}
			//stars
			int st=1;
			
			while(st<=2*r-1){
				System.out.print("*");
				st=st+1;
			}
			System.out.println();
			r=r+1;
		}
        }
	}

/*
spaces:
2+(i-1)-1
2+i-1
1-i(N=1)
rows:
1+(i-1)2
1+2i-2
2i-1
*/
