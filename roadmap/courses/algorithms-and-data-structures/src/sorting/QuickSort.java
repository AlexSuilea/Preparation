package sorting;

public class QuickSort {
    public static int[] quickSort(int[] arr, int start, int end) {
        if(end - start + 1 <= 1) {
            return arr;
        }

        int pivot = arr[end];
        int left = start;

        for(int i=start; i<end; i++) {
            if(arr[i] < pivot) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }

        // Move pivot in-between left & right sides
        arr[end] = arr[left];
        arr[left] = pivot;

        quickSort(arr, start, left-1);
        quickSort(arr, left+1, end);

        return arr;
    }
}
