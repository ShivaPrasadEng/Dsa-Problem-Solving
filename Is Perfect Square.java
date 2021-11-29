//Is Perfect Square 
import java.lang.*;
import java.util.*;
//Electricity bill
public class javapr1 {
	public static void main(String[] args) {
		int A=100;
		for(int i=1; i*i<=A;i++) {
			for(int j=1;j*j<=A;j++) {
				if(i==j && i*j==A) {
				System.out.println(i +" "+ j);
				}
			} 
		}
	        
    }
}

//or

public class Solution {
    public int solve(int A) {
        int r=0;
        for (int i=1;i*i<=A;i++){
            for(int j=1;j*j<=A;j++){
                if((i*j==A) && (i==j)){
                    r=1;
                }
            }
        }
    return r;
        
    }
}

//100
//i=1,j=1,i=5,

