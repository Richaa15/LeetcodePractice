class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //s = start, e = end
        int s = 0, e = arr.length - 1, mid;
        while (s < e) {
            mid = (s + e) / 2;
            if (arr[mid] < arr[mid + 1]) //increasing part of array
                s = mid + 1; //Peak element is in the right part
            else
                e = mid; //Decreasing part of array
            //So ned to checck in left part
            //can't ignore mid element in this part
        }
        return s;
        //l and r are always trying to find maximum elements in above 2 checks.
        //When they will point to the same element
        //That will be the peak elemnt
    }
}