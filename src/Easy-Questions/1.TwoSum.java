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
 */

class Program {

    public static int[] twoSum(int[] array, int goalSum) {
        for (int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
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
      values are stored in the hash
      table for reference.

    - O(n) space because additional memory
      required for the hash table.
 */

class Program {

    public static int[] twoSum(int[] array, int goalSum) {
        HashMap <Integer> nums = new HashMap<>();
        for (int num : array) {
            int potenMatch = goalSum - num;
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
    Third Solution - Neat solution

    - O(n) time | O(n) space

    - O(n) time because values aren't
      visited more than once because
      those values are stored in the
      hash table for reference.

    - O(1) space because no additional
      memory required.
 */

class Program {

    public static int[] twoSum(int[] array, int goalSum) {
        Arrays.sort(array);
        int leftVal = 0;
        int rightVal = array.length - 1;
        int currentSum = leftVal + rightVal;

        while (leftVal < rightVal) {
            if (currentSum == goalSum) {
                return new int[] {array[leftVal], array[rightVal]};
            }
            else if (currentSum < goalSum) {
                left++;
            }
            else (currentSum > goalSum) {
                right++;
            }
        }
        return new int[0];
    }
}