//Array Pass By Value
import java.lang.*;
import java.util.*;

//Arrays
public class javapr1 {
	//Pass by Value for Stack(Premitive Datatypes)
	static void pasValStack(int M) {
		M=M-(int)(0.15*M);
		System.out.println("Pass by Value for Stack "+M);
	}
	//Pass by Value for Heap(Objects)
	static void passValHeap(int[] N) {
		for(int i=0;i<N.length;i++) {
			N[i]=N[i]-(int)(0.15*N[i]);
			System.out.println("Pass by Value for Stack "+N[i]);
		}
	}
	public static void main(String[] args) {
		//stack
		int M=100;
		System.out.println("Before Value Stack "+M);
		pasValStack(M);
		System.out.println("After Value Stack "+M);
		//Heap
		int[] N= {100,200,300};
		for(int i=0;i<N.length;i++) {
			System.out.println("Before Value Heap "+N[i]);
		}
		passValHeap(N);
		for(int i=0;i<N.length;i++) {
			System.out.println("After Value Heap "+N[i]+" ");
		}

	}
}

/*

 */
