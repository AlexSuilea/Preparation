package arrays;

public class ReverseElementsOfArray {

    public static void reverseArray(int[] array){
        int[] newArray = new int[array.length];

        int j = array.length;
        for(int element: array){
            newArray[j-1] = element;
            j--;
        }

        for(int element: newArray){
            System.out.print(element + " ");
        }

    }
}
