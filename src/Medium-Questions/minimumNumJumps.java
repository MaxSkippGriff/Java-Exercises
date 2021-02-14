import java.util.*;

/*
    Minimum Number of Jumps Question
    ---------------------------------
    - An array of different values
    - Each value represents a number of
      jumps
    - Find the minimum number of jumps
      to reach end of array
    e.g. {4, 1, 2, 3, 1, 1, 5, 5, 3, 1, 2, 1}
         {4  ...-> 3  .. -> 5       ... -> 1}
*/


/*
    Only Solution - Basic solution

    - O(n^2)) time | O(1) space

    - O(n^2) time because the number of
      nodes in the linked list is n.

    - O(1) space because no additional
      memory is required to reverse the
      linked list.
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