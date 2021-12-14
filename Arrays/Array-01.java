  //Array
  import java.lang.*;
import java.util.*;

//Arrays
public class javapr1 {
	static void arrayFun() {
		/*int[] arr= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" "+arr[i]);
		}
		for(int x:arr) {
			System.out.println(x);
		}*/
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
}

/*

 */
