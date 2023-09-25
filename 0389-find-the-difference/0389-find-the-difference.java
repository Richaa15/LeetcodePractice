class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count the frequency of characters in string t
        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Subtract the frequency of characters in string s
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.get(c) - 1);
        }
        
        // Find the character with a positive count (added character)
        for (char c : t.toCharArray()) {
            if (charCount.get(c) > 0) {
                return c;
            }
        }
        
        // Return a dummy value (should not reach here)
        return '\0';
    }
}