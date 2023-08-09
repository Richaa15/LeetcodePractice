class Solution {
    public int strStr(String haystack, String needle) {
        int n =0;
        int nLen = needle.length(), hLen  = haystack.length();
        for(int i =0 ; i<hLen; i++) {
            if(haystack.charAt(i) == needle.charAt(n)) {
                n++;
            }else{
                i = i-n;
                n=0;
            }

            if(n == nLen){
                return i-n+1;
            }
        }
        return -1;
    }
}