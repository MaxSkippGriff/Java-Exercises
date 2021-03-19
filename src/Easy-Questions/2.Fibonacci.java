import java.util.*;

/*
   Fibonacci -
   Three solutions to the Fibonacci
   question with improving space/time
   complexity.
 */


 /*
     First Solution - Brute Force

     - O(n^2) time | O(n) space

     - O(n^2) time because i and j both
       iterate through the array, which
       is i * j.

     - O(n) space because n is the length
       of the array of fibonacci numbers
  */

class Program {

    public static int getNthFib(int n) {
        // Set base cases
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        // Calculate next value by adding previous two values
        else {
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }
}


/*
    Second Solution - Hash table

    - O(n) time | O(n) space

    - O(n) time where n is the length of
      the array

    - O(n) space for the hash table
 */

/*
    NB :- 'memo' refers to memoisation,
    the process of caching return values
    in a hash table. This is a time-space
    trade off i.e. one which improves speed
    at the expense of space.
*/

class Program {

    public static int getNthFib(int n) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        // Cache first two values in the sequence
        memo.put(1, 0);
        memo.put(2, 1);
        return getNthFib(n, memo);
    }

    public static int getNthFib(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        // If values aren't in the hash table, perform calculation and
        // store return value in hash table.
        else {
            memo.put(n, getNthFib(n - 1, memo) + getNthFib(n - 2, memo));
            return memo.get(n);
        }
    }
}

/*
    Third Solution - Clever solution

    - O(n) time | O(1) space

    - O(n) time where n is the length of
      the array because we have to create n
      fibonacci numbers

    - O(1) because no additional space required
 */


class Program {

    public static int getNthFib(int n) {
        // Store first two fib values
        int[] finalTwoVals = {0, 1};
        int cnt = 3;

        // While counter is less than n, keep calculating sequence
        while (cnt <= n) {
            // Take first fib and throw it away, put second fib in its place
            // Get next fib number and put it in place of second fib, and so on
            int nextVal = finalTwoVals[0] + finalTwoVals[1];
            finalTwoVals[0] = finalTwoVals[1];
            finalTwoVals[1] = nextVal;
            cnt++;
        }
        if (n > 1) {
            return finalTwoVals[1];
        }
        else {
            return finalTwoVals[0];
        }

    }
}
