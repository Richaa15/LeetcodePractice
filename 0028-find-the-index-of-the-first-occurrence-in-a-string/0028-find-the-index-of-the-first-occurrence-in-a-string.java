class Solution {
    public int strStr(String haystack, String needle) {
        int h = 0, n =0;
        for(int i =0 ; i<haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(n)) {
                n++;
            }else{
                i = i-n;
                n=0;
            }

            if(n == needle.length()){
                return i-n+1;
            }
        }
        return -1;
    }
}