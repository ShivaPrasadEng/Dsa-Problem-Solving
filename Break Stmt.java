//Break Statment
import java.lang.*;
import java.util.*;

//Electricity bill
public class sp_02 {
	public static void main(String[] args) {
		int c=0;
		boolean m=true;
		while(c<=100){
			System.out.println(c);
			if(m && c==70) {
				break;
			}
			c=c+10;
		}
        }
	}
