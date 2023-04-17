package numbers;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> fibonacciSequence(Integer number) {
        List<Integer> result = new ArrayList<>();
        int num1 = 1, num2 = 1, fib = 0;
        result.add(num1);
        result.add(num2);

        while(fib<=number){
            fib = num1 + num2;

            if(fib>number) {
                break;
            }

            result.add(fib);

            num1 = num2;
            num2 = fib;
        }
        return result;
    }
}
