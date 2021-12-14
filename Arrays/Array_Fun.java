//Array With Function
import java.lang.*;
import java.util.*;

//Arrays
public class javapr1 {
	static void arrayFun(int[] n) {
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		/*for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}*/
		arrayFun(arr);
	}
}

/*

 */
