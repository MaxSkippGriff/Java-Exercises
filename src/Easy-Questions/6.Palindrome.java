import java.util.*;

/*
    Palindrome Question
    -------------------
*/


/*
    Only Solution - Optimal solution

    - O(n)) time | O(1) space

    - O(n) time because values of array
      only visited once, and array size
      is n.

    - O(1) space because no additional
      memory is required to iterate
      through the array.
 */




class Program {

    public static int[] palindromeCheck(int[] array) {
        int leftIdx = 0;
        int rightIdx = string.length() - 1;
        while (leftIdx < rightIdx) {
            if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
                return false;
            }
            leftIdx++;
            rightIdx--;
        }
        return true;
    }
}