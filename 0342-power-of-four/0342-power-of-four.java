class Solution {
    public boolean isPowerOfFour(int n) {
        while(n>=4){
            if(n%4 == 0){
                n /= 4;
                continue;
            }else{
                return false;
            }
        }
        if(n==1) return true;
        
        return false;
    }
}