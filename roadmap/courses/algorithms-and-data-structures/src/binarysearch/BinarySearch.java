package binarysearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right)/2;

            if(target > arr[mid]) {
                left = mid+1;
            } else if(target < arr[mid]){
                right = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
