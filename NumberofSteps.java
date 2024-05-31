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
