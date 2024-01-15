class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<String>();
        String[] words = s.trim().split("\\s+"); // Trim and split by one or more spaces
        for (String word : words) {
            st.push(word);
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
            if (!st.isEmpty()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
