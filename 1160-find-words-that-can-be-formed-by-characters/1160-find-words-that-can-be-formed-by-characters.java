class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> counts = new HashMap<>();
        for(Character c : chars.toCharArray()){
            counts.put(c, counts.getOrDefault(c,0) +1);
        }
        int ans = 0;
        for(String w: words){
            Map<Character, Integer> hm = new HashMap<>();
            for(Character c: w.toCharArray()){
                hm.put(c, hm.getOrDefault(c,0)+1);
            }
            boolean flag = true;
            for(Character c : hm.keySet()){
                if(counts.getOrDefault(c, 0) < hm.get(c)){
                    flag = false;
                    break;
}
                }
            if(flag) {
                ans+= w.length();
            }
        }
        return ans;
    }
}