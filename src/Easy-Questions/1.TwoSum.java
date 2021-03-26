import java.util.*;


/*
    Two Sum Question
    ----------------
*/


/*
    First Solution - Brute Force

    - O(n^2) time | O(1) space

    - O(n^2) time because i and j both
      iterate through the array, which
      is i * j.

    - O(1) space because no additional
      memory is required to iterate
      through the array.

      This is a naive solution which can
      be improved.
 */

class Program {

    public static int[] twoSum(int[] array, int goalSum) {
        // Iterate through array checking for pairs that sum to goalSum
        for (int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                // If goalSum found, return pair
                if (firstNum + secondNum == goalSum) {
                    return new int[] {firstNum, secondNUm};
                }
            }
            return new int[0];
        }
    }
}

/*
    Second Solution - Hash Table

    - O(n) time | O(n) space

    - O(n) time because values aren't
      visited more than once since
      they are stored in the hash
      table for reference.

    - O(n) space because additional memory
      required for the hash table.
 */

class Program {

    public static int[] twoSum(int[] array, int goalSum) {
        // Create hash table
        HashMap <Integer> nums = new HashMap<>();
        for (int num : array) {
            // Potential match equivalent to goalSum - int in array
            int potenMatch = goalSum - num;
            // If match found, return pair
            if (nums.contains(potenMatch)) {
                return new int[] {potenMatch, num};
            }
            else {
                nums.add(num);
            }
        }
        return new int[0];
    }
}

/*
    Third Solution - Neat solution using sort function

    - O(n) time | O(n) space

    - O(nlog(n)) time because we go through the array n
      times, which is O(n) time, and the array is sorted
      - the best sorting algorithms (Quick sort, for e.g.)
      run in log(n) time.
      O(n) + O(log(n) = O(nlog(n)

    - O(1) space because no additional
      memory required.
 */

class Program {

    public static int[] twoSum(int[] array, int goalSum) {
        // Sort array
        Arrays.sort(array);
        // Create leftmost and rightmost indices
        int leftVal = 0;
        int rightVal = array.length - 1;
        int currentSum = leftVal + rightVal;

        // Ensure indices don't overlap
        while (leftVal < rightVal) {
            // If goalSum found, return pair
            if (currentSum == goalSum) {
                return new int[] {array[leftVal], array[rightVal]};
            }
            // If currentSum is less than goalSum, increment leftVal to
            // increase sum and find goalSum
            else if (currentSum < goalSum) {
                leftVal++;
            }
            // If currentSum is greater than goalSum, decrement rightVal to
            // decrease sum and find goalSum
            else (currentSum > goalSum) {
                rightVal++;
            }
        }
        return new int[0];
    }
}
