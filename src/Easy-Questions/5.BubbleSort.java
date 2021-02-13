import java.util.*;

/*
    Bubble Sort Question
    --------------------
*/


/*
    Only Solution - Basic Bubble Sort

    - O(n^2) time | O(1) space

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