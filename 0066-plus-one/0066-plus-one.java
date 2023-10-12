class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate from right to left and add 1 to the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // No carry required, so we're done
                return digits;
            } else {
                digits[i] = 0; // Set the current digit to 0 and continue to the next
            }
        }
        
        // If we reach here, it means we have a carry into a new digit
        int[] result = new int[n + 1];
        result[0] = 1; // The new most significant digit is 1
        return result;
    }
}
