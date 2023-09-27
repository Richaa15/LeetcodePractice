class Solution {
    public String decodeAtIndex(String s, int k) {
        int n = s.length();
        long len = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                len *= (c - '0');
            }
            else len++;
        }

        for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                len = len / (c - '0'); 
                k %= len;
            }
            else {
                if(k == 0 || k == len) return Character.toString(c);
                len --;
            }
        }
        return "";
    }
}