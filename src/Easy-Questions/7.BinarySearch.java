import java.util.*;

/*
    Binary Search Question
    -----------------------
*/


/*
    First Solution - Brute Force

    - O(log(n)) time | O(log(n)) space

    - O(log(n)) time because i and j both
      iterate through the array, which
      is i * j.

    - O(log(n)) space because no additional
      memory is required to iterate
      through the array.
 */

class Program {

    public static int[] binarySearch(int[] array) {
        int left = 0;
        int right = array.length - 1;
        return binarySearch(array, target, left, right);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        int potentialMatch = array[middle];

        if (target == potentialMatch) {
            return middle;
        }
        else if (target < potentialMatch) {
            return binarySearch(array, target, left, middle - 1);
        }
        else {
            return binarySearch(array, target, middle + 1, right);
        }
    }
}