class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Boolean> hm2 = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            char a = s.charAt(i), b = t.charAt(i);
            if(hm1.containsKey(a) == true){
                if(hm1.get(a) != b) return false;
}
            else{
                if(hm2.containsKey(b) == true){
                    return false;
                }else{
                    hm1.put(a, b);
                    hm2.put(b,true);
                }
            }
}
        return true;
    }
}