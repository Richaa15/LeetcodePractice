class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        //l=start, e =end
        int l  = 0, e = s.length() - 1;
        
        while(l<=e) {
            char cF = s.charAt(l);
            char cL = s.charAt(e);
            
            if(!Character.isLetterOrDigit(cF)) {
                l++;
            } else if(!Character.isLetterOrDigit(cL)) {
                e--;
            } else{
                if(Character.toLowerCase(cF) != Character.toLowerCase(cL)) {
                   return false; 
                }
                l++;
                e--;
            }
            
        }
        return true;
    }
}