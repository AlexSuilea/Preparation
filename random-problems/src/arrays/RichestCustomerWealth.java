package arrays;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int money : account) {
                sum += money;
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
