class Solution {
    public String reverseWords(String s) {
        char[] ss = s.toCharArray();
        int l = 0;
        for(int r = 0; r<ss.length; r++){
            if(ss[r] == ' '){
                reverse(ss, l, r-1);
                l = r+1;
            }
        }
        
        reverse(ss, l, ss.length - 1);
        
        return new String(ss);
    }
        
        public void reverse(char[] ss, int l,int r){
            while(l<r){
                char temp = ss[l];
                ss[l] = ss[r];
                ss[r] = temp;
                l++;
                r--;
            }
        }
}