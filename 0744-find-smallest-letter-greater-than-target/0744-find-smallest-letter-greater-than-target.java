class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s =0;
        int e = letters.length -1;
        while (s<=e) {
            int mid = s + (e-s)/2;
            if (target < letters[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        //when condition will be violated
        //i.e s = e+1 => N
        //N%N will return 0 hence first element of array
        return letters[s % letters.length];
    }
}