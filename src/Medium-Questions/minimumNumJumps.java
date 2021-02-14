import java.util.*;

/*
    Minimum Number of Jumps Question
    ---------------------------------
    - An array of values
    - Each value represents the max number of
      jumps you can take to the next value
    - Find the minimum number of jumps to reach
      end of the array

      e.g. {4, 1, 2, 3, 1, 1, 5, 5, 3, 1, 2, 1}
           {4  ...-> 3  .. -> 5       ... -> 1}
*/


/*
    First Solution - Brute force solution

    - O(n^2)) time | O(1) space

    - O(n^2) time because we iterate through
      the array once and at each of the indices we
      iterate through all the values that precede it.

    - O(n) space because n is the length of the
      numsOfJumps array.
 */




class Program {

    public static int minimumNumJumps(int [] array) {
        int numOfJumps = new int[array.length];
        Arrays.fill(jumps, Integer.MAX_VALUE);
        numOfJumps[0] = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j < array.length; j++) {
                if (array[j] >= i - j) {
                    jumps[i] = Math.min(numOfJumps[j] + 1, numOfJumps[i]);
                }
            }
        }
        return numOfJumps[numOfJumps.length - 1];
    }
}