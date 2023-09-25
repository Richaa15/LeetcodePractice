class Solution{
public char findTheDifference(String s, String t) {
    int i = 0, result = 0;
    while (i < s.length()) {
        result ^= t.charAt(i) ^ s.charAt(i);
        i++;
    }
    if (i < t.length())
        result ^= t.charAt(i);
    return (char) result;
}
}