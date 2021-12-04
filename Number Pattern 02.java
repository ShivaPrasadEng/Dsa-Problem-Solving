/*
   1
  232
 34543
4567654
*/
import java.lang.*;
import java.util.*;

//Electricity bill
public class javapr1 {
	public static void main(String[] args) {
		int N=4;
		int r=1;
		int v=1;
		while(r<=N) {
			//spaces
			int s=1;
			while(s<=N-r) {
				System.out.print(" ");
				s=s+1;
			}
			//increment values
			int i=1;
			v=r;
			while(i<=r) {
				System.out.print(v);
				v=v+1;
				i=i+1;
			}
			
			//decrement vales;
			v=2*r-2;
			int d=1;
			while(d<=r-1) {
				System.out.print(v);
				d=d+1;
				v=v-1;
			}
			System.out.println();
			r=r+1;
		}
		  
        }
	}

/*
n=4;
   1            
  232
 34543
45676454

*/
