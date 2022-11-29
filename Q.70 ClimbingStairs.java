//Used Fibonacci Series for solving this problem
class Solution {
    public int climbStairs(int n) {
         if (n == 1 || n == 2) return n;
        int stepsSecondPrevious = 1, previousStair = 2;
        for (int i = 3; i <= n; i++) {
            int crrSteps = stepsSecondPrevious + previousStair;
            stepsSecondPrevious = previousStair;
            previousStair = crrSteps;
        }
        return previousStair;
    }
}
