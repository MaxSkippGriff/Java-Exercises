import java.util.*;

/*
    Validate Subsequence Question
    ------------------------------
    - Two arrays.
    - Work out whether the second
      array is a 'subsequence' of
      the first (i.e. contains values
      in the same adjacent/non-adjacent
      order.
*/


/*
    First Solution - List

    - O(n) time | O(1) space

    - O(n) time because n is the length
      of the array and only one iteration
      is required.

    - O(1) space because no additional
      memory is required to iterate
      through the array.
 */

class Program {

    public static int[] validateSubsequence(List<Integer> array, List<Integer> sequence) {
        int indexArr = 0;
        int indexSeq = 0;
        while (indexArr < array.size() && indexSeq < sequence.size()) {
            if (array.get(indexArr).equals(sequence.get(seqIdx))) {
                indexSeq++;
            }
            indexArr++;
        }
        return indexSeq == sequence.size();
    }
}


/*
    Second Solution -

    - O(n) time | O(1) space

    - O(n) time because n is the length
      of the array and only one iteration
      is required.

    - O(1) space because no additional
      memory is required to iterate
      through the array.
 */

class Program {

    public static int[] validateSubsequence(List<Integer> array, List<Integer> sequence) {
        int indexSeq = 0;
        for (var value : array) {
            if (indexSeq == sequence.size()) {
                break;
            }
            if (sequence.get(seqIdx).equals(value)) {
                indexSeq++;
            }
        }
        return indexSeq == sequence.size();
    }
}