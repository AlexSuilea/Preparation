package recursion;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int a = 1;
        int b = 1;

        for(int i=0; i< n-1; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
