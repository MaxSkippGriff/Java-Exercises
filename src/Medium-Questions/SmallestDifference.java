opeimport java.util.*;

/*
    Smallest Difference Question
    ----------------------------
    - Two non-empty arrays.
    - Find pair with the smallest
      difference.
*/


/*
    First Solution - Brute Force

    - O(nlog(n) + O(mlog(n)) time | O(1) space

    - O(nlog(n) + O(mlog(n)) time because i and
      j both iterate through the array, which
      is i * j.

    - O(log(n)) space because no additional
      memory is required to iterate
      through the array.
 */




class Program {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Sort arrays
        Arrays.sort(arrayTwo);
        Arrays.sort(arrayTwo);
        /*
          Initialise indexes and smallest
          and current variables.
        */
        int indexOne = 0;
        int indexTwo = 0;
        int smallestDiff = Integer.MAX_VALUE;
        int currentVal = Integer.MAX_VALUE;

        int[] smallestDiffPair = new int[2];
        while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
            int firstVal = arrayOne[indexOne];
            int secondVal = arrayTwo[indexTwo];
            /*
               Checks diffence and increases
               index of array with smallest
               value.
            */
            if (firstVal < secondVal) {
                currentVal = secondVal - firstVal;
                indexOne++;
            }
            else if (firstVal > secondVal) {
                currentVal = firstVal - secondVal;
                indexTwo++;
            }
            else {
                return new int[] {firstVal, secondNum};
            }
            if (smallestDiff > currentVal) {
                smallestDiff = currentVal;
                smallestDiffPair = new int[] {firstVal, secondVal};
            }
        }
        return smallestDiffPair;
    }
}