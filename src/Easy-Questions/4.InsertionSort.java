import java.util.*;

/*
    Insertion Sort Question
    ------------------------
*/


/*
    Only Solution - Simple insertion sort

    - Best: O(n) time | O(1) space
    - Average: O(n^2) time | O(1) space
    - Worst: O(n^2) time | O(1) space
 */

class Program {

    public static int[] insertionSort(int[] array) {
        if (array.length == 0) {
            return new int[]{};
        }
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                i = j - 1;
                swap(j, i, array);
                j -= 1;
            }
        }
        return array;
    }
    public static int[] swap(int j, int i, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
