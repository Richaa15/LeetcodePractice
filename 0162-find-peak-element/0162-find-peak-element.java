class Solution {
    public int findPeakElement(int[] arr) {
        int l = 0, r = arr.length - 1, mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (arr[mid] < arr[mid + 1])
                l = mid + 1;
            else
                r = mid;
        }
        return l;
        //l and r are always trying to find maximum elements in above 2 checks.
    }
}