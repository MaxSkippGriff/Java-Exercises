import java.util.*;

/*
    Palindrome Question
    -------------------
*/


/*
    Third Solution - Brute Force

    - O(n)) time | O(1) space

    - O(log(n)) time because i and j both
      iterate through the array, which
      is i * j.

    - O(log(n)) space because no additional
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