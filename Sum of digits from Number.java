//Sum of digits from Number
import java.lang.*;
import java.util.*;

//Electricity bill
public class sp_02 {
	public static void main(String[] args) {
		int N=314020;
		int d;
		int sum=0;
		while(N!=0) {
			d=N%10;
			sum=sum+d;
			N=N/10;
		}
		System.out.println(sum);
        }
	}
