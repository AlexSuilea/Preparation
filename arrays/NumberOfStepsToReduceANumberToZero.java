package arrays;

public class NumberOfStepsToReduceANumberToZero {
    public static int numberOfSteps(int num) {
        int stepToZero = 0;
        while(num != 0) {
            if(num % 2 == 0){
                num /= 2;
            } else {
                num -= 1;
            }
            stepToZero++;
        }
        return stepToZero;
    }
}
