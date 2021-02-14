import java.util.*;

/*
    Smallest Difference Question
    ----------------------------
    - Two non-empty arrays.
    - Find pair with the smallest
      difference.
*/


/*
    Only Solution - Brute Force

    - O(nlog(n) + O(mlog(n)) time | O(1) space

    - O(nlog(n) + O(mlog(n)) time where n is the
      length of arrayOne and m is the length of
      arrayTwo. We sorth both arrays with time
      complexity of nlog(n) + mlog(m), and iterate
      through all values once in o(n)+(m) time.

    - O(1) space because no additional memory is
      required since arrays are sorted in place
      and no addtional memory is required.
 */




class Program {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Sort arrays in place
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        /*
          Initialise indexes and smallest
          and current variables with max value.
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
            } // Update smallest difference
            if (smallestDiff > currentVal) {
                smallestDiff = currentVal;
                smallestDiffPair = new int[] {firstVal, secondVal};
            }
        }
        return smallestDiffPair;
    }
}