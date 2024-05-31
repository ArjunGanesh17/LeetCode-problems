/*
Leetcode 1342
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
number of steps to reach 0
eg n=14
step 1 n is even n/2=7 
step 2 n is odd n=n-1 6
step 3 even 6/2 = 3
step 4 odd 3-1=2
step 5 even 2/2=1
step 6 odd 1-1=0
return steps
 */
public class NumberofSteps {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }
    static int steps(int n){
      return helper(n,0);
    }
    private static int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        else if(n%10==0){
            return helper(n/10,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
