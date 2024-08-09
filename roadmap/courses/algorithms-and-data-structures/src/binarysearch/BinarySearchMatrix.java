package binarysearch;

public class BinarySearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int left = 0;
        int right = ROWS - 1;

        while(left <= right) {
            int mid = (left+right)/2;
            if(target > matrix[mid][COLS-1]) {
                left = mid + 1;
            } else if(target < matrix[mid][0]) {
                right = mid - 1;
            } else {
                break;
            }
        }

        if(!(left <= right)) {
            return false;
        }

        int row = (left + right)/2;
        int top = 0;
        int bot = COLS - 1;

        while (top <= bot) {
            int mid = (top+bot)/2;
            if(target > matrix[row][mid]) {
                top = mid + 1;
            } else if(target < matrix[row][mid]) {
                bot = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
