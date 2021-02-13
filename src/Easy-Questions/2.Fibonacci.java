import java.util.*;

/*
   Fibonacci -
   Three solutions to the Fibonacci
   question with improving space/time
   complexity.
 */


// 1. Brute force - O(2^n) | O(n) space

class Program {

    public static int getNthFib(int n) {
        // Set base cases
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        else {
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }
}



// 2. Hash table - O(n) time | O(n) space

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
        memo.put(1, 0);
        memo.put(2, 1);
        return getNthFib(n, memo);
    }

    public static int getNthFib(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        else {
            memo.put(n, getNthFib(n - 1, memo) + getNthFib(n - 2, memo));
            return memo.get(n);
        }
    }
}


// 3 - O(n) time | O(1) space

class Program {

    public static int getNthFib(int n) {
        int[] finalTwoVals = {0, 1};
        int cnt = 3;

        while (cnt <= n) {
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