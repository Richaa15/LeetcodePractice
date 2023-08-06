public class Solution {
    private static final long MOD = 1_000_000_007;

    public int numMusicPlaylists(int n, int goal, int k) {
        // Calculate factorials for each number up to 'n'
        long[] factorial = new long[n + 1];
        factorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }

        // Calculate inverse factorials using previously calculated factorials
        long[] invFactorial = new long[n + 1];
        invFactorial[n] = power(factorial[n], (int) (MOD - 2));

        for (int i = n - 1; i >= 0; i--) {
            invFactorial[i] = (invFactorial[i + 1] * (i + 1)) % MOD;
        }

        // Initialize variables for calculation
        long answer = 0;
        int sign = 1;

        // Loop from 'n' down to 'k'
        for (int i = n; i >= k; i--) {
            // Calculate temporary result for this iteration
            long temp = power(i - k, goal - k);
            temp = (temp * invFactorial[n - i]) % MOD;
            temp = (temp * invFactorial[i - k]) % MOD;

            // Add or subtract temporary result to/from answer
            answer = (answer + sign * temp + MOD) % MOD;

            // Flip sign for next iteration
            sign *= -1;
        }

        // Final result is n! * answer, all under modulo
        return (int) ((factorial[n] * answer) % MOD);
    }

    // Method to calculate power of a number under modulo using binary exponentiation
    private long power(long base, int exponent) {
        long result = 1L;

        // Loop until exponent is not zero
        while (exponent > 0) {
            // If exponent is odd, multiply result with base
            if ((exponent & 1) == 1) {
                result = (result * base) % MOD;
            }
            // Divide the exponent by 2 and square the base
            exponent >>= 1;
            base = (base * base) % MOD;
        }

        return result;
    }
}

