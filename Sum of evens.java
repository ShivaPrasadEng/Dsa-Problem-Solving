//Sum of evens!
public class Solution {
    public int solve(int A) {
        int s=0;
        for(int i=1;i<=A;i++){
            if(i%2==0){
                s=s+i;
            }

        }
        return s;
    }
}
