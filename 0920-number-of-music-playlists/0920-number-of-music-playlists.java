public class Solution {
    private static final long MOD = 1_000_000_007;

    public int numMusicPlaylists(int n, int goal, int k) {
        long[] factorial = new long[n + 1];
        factorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }

        long[] invFactorial = new long[n + 1];
        invFactorial[n] = power(factorial[n], (int) (MOD - 2));

        for (int i = n - 1; i >= 0; i--) {
            invFactorial[i] = (invFactorial[i + 1] * (i + 1)) % MOD;
        }

        long answer = 0;
        int sign = 1;

        for (int i = n; i >= k; i--) {
            long temp = power(i - k, goal - k);
            temp = (temp * invFactorial[n - i]) % MOD;
            temp = (temp * invFactorial[i - k]) % MOD;

            answer = (answer + sign * temp + MOD) % MOD;
            sign *= -1;
        }

        return (int) ((factorial[n] * answer) % MOD);
    }

    private long power(long base, int exponent) {
        long result = 1L;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % MOD;
            }
            exponent >>= 1;
            base = (base * base) % MOD;
        }

        return result;
    }
}
