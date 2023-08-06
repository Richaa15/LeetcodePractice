class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        
        int[] sD = new int[10];
        int[] gD = new int[10];
        
        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            
            if (s == g) {
                bulls++;
            } else {
                sD[s]++;
                gD[g]++;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            cows += Math.min(sD[i], gD[i]);
        }
        
        return bulls + "A" + cows + "B";
    }
}