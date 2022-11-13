public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            // Condition if the last digit is less than 9 then simply update that number by +1 and return the digits
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // If the current digit is equal to 9 then simply update that digit to zero and iterate the loop
        }
        int[] ans = new int[n + 1]; // Get executed when there is condition in which the array/number size is about to increase 
        ans[0] = 1;
        return ans;
    }
