/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s= 0, e = n-1, m=0;
        
        while(s<=e) {
            m = s+ (e-s)/2;
            if(isBadVersion(m) == false) {
                s = m+1;
            }else if(isBadVersion(m) == true){
                e = m-1;
            }
        }
        return e+1;
    }
}