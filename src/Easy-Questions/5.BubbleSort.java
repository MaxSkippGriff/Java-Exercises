import java.util.*;

/*
    Bubble Sort Question
    --------------------
*/


/*
    Only Solution - Basic Bubble Sort

    - Best: O(n) time | O(1) space
    - Average: O(n^2) time | O(1) space
    - Worst: O(n^2) time | O(1) space
 */

class Program {

    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return new int[] {};
        }
        boolean isSorted = false;
        int cnt = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i+1]) {
                    int j = int i + 1;
                    swap(i, j, array);
                    isSorted = false;
                }
            }
            cnt++;
        }
        return array;
    }
    public static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}