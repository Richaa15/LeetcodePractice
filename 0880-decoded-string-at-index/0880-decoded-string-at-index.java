class Solution {
    public String decodeAtIndex(String encodedString, int k) {
       long size = 0;
        char[] s = encodedString.toCharArray();
        for(int i = 0; i< s.length; i++){
            if(Character.isDigit(s[i])){
                size = (size*(s[i] - '0'));
            }else{
                size++;
            }
        }
        int n = s.length;
        for(int i =n-1; i>=0; i--){
            k %= size;
            if(k ==0 && Character.isLetter(s[i]) || k== size && Character.isLetter(s[i])){
               return Character.toString(s[i]);
                }
            if(Character.isDigit(s[i])){
                size /= (s[i] - '0');
            }else{
                size --;
}
        }
        return null;
    }
}