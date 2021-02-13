import java.util.*;

/*
    Binary Search Question
    -----------------------
*/


/*
    Only Solution - Basic Binary Search

    - O(log(n)) time | O(log(n)) space

    - O(log(n)) time because array is halved
      until target value is found.

    - O(log(n)) space because array size
      is halved until target value is found.
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