import java.util.*;

/*
    Insertion Sort Question
    ------------------------
*/


/*
    Only Solution - Simple insertion sort

    - Best case: O(n) time | O(1) space
    - Average case: O(n) time | O(1) space
    - Worst case: O(n^2) time | O(1) space

    - O(n^2) time because i and j both
      iterate through the array, which
      is i * j.

    - O(1) space because no additional
      memory is required to iterate
      through the array.
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
