package arrays;

/*
Given an integer 'n', find the smallest integer so that the product of its digits equals n.
 */

public class ProductDigits {
    public static void resolve(int n){
        int copyN = n;
        int prod = 1;

        while(copyN != 0) {
            prod *= copyN % 10;
            copyN /= 10;
        }

        if(prod == n) {
            System.out.println(n);
        }

    }
}
