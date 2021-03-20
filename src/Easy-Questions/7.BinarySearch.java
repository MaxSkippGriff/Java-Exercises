import java.util.*;

/*
    Binary Search Question
    -----------------------
    Note:
    These solutions assume that the test
    array is sorted.
*/


/*
    First Solution - Recursive Binary Search

    - O(log(n)) time | O(log(n)) space

    - O(log(n)) time because array is halved
      after every traversal until target value
      is found.

    - O(log(n)) space because the algorithm is
      implemented recurisively which requires
      memory usage on the call stack.
 */

class Program {

    public static int[] binarySearch(int[] array) {
        // Set left and rightmost indices
        int left = 0;
        int right = array.length - 1;
        return binarySearch(array, target, left, right);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        // Set the mid-point and assign the potentialMatch to
        // mid-point
        int middle = (left + right) / 2;
        int potentialMatch = array[middle];

        if (target == potentialMatch) {
            return middle;
        }
        // If target is less than potentialMatch, move to
        // left half of array, otherwise move to right half
        else if (target < potentialMatch) {
            return binarySearch(array, target, left, middle - 1);
        }
        else {
            return binarySearch(array, target, middle + 1, right);
        }
    }
}

/*
    Second Solution - Iterative binary search with
                      improved space complexity

    - O(log(n)) time | O(1) space

    - O(log(n)) time because array is halved
      until target value is found.

    - O(1) space because it is implemented
      iteratively so we don't store anything
      additional in memory.

*/



 class Program {

      public static int binarySearch(int[] array, int target) {
 		       // Set left and rightmost indices
          int left = 0;
 		       int right = array.length - 1;
 		       // Set potentialMatch to middle of array
 		       while (left <= right) {
              int middle = (left + right) / 2;
              int potentialMatch = array[middle];

              // If potentialMatch equals target, return value
              if (target == potentialMatch) {
                  return middle;
              }
              // If target is less than potentialMatch, move to
              // left half of array
              else if (target < potentialMatch) {
                  right = middle - 1;
              }
              // Move left pointer to right half of array
              else {
                  left = middle + 1;
              }
          }
          return -1;
      }
 }
