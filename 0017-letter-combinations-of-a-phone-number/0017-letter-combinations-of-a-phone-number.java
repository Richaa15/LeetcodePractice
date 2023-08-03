class Solution {
    List<String> res = null; // Declaration of a List of Strings named 'res' and initializing it to null.
    String[] strMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // An array of strings representing the mapping of digits to letters on a phone keypad.

    public List<String> letterCombinations(String digits) { // Method to find all possible letter combinations for a given input digits string.
        res = new ArrayList<>(); // Initializing the 'res' List to an empty ArrayList of Strings.
        if (digits.length() == 0) { // If the input digits string is empty, just return the empty result list.
            return res;
        }
        dfs(0, digits, new StringBuilder()); // Start the depth-first search (DFS) from index 0 with an empty temporary StringBuilder.
        return res; // Return the final result list containing all possible letter combinations.
    }

    void dfs(int length, String digits, StringBuilder temp) { // Depth-first search function to find all possible letter combinations.
        if (length == digits.length()) { // If the temporary string's length is equal to the input digits length, we have found a valid combination.
            res.add(temp.toString()); // Add the temporary string (current combination) to the result list.
            return; // Return from the current recursive call.
        }

        char ch = digits.charAt(length); // Get the current digit character from the input digits string.
        String str = strMap[ch - '0']; // Get the corresponding string of letters associated with the current digit.

        for (char c : str.toCharArray()) { // Iterate over each character (letter) in the associated string for the current digit.
            temp.append(c); // Add the current letter to the temporary StringBuilder.
            dfs(length + 1, digits, temp); // Recursively call the dfs function for the next digit in the input digits string.
            temp.deleteCharAt(temp.length() - 1); // Backtrack by removing the last added character (letter) from the temporary StringBuilder.
        }
    }
}
