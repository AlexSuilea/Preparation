package sorting;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
        return arr;
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int length1 = mid - left + 1;
        int length2 = right - mid;

        int[] tempL = new int[length1];
        int[] tempR = new int[length2];

        for (int i = 0; i < length1; i++) {
            tempL[i] = arr[left + i];
        }

        for (int i = 0; i < length2; i++) {
            tempR[i] = arr[mid + 1 + i];
        }

        int i=0, j=0, k=left;

        while(i<length1 && j<length2) {
            if(tempL[i] < tempR[j]) {
                arr[k] = tempL[i];
                i++;
            } else {
                arr[k] = tempR[j];
                j++;
            }
            k++;
        }

        while(i<length1) {
            arr[k] = tempL[i];
            i++;
            k++;
        }

        while(j<length2) {
            arr[k] = tempR[j];
            j++;
            k++;
        }
    }
}
