class Solution {
    public int[] sortArrayByParity(int[] a) {
        for(int i=0, j= 0; j<a.length ; j++){
            if(a[j] % 2 == 0){
               int temp = a[i];
               a[i++] =  a[j];
                a[j] = temp;
            }
        }
        return a;
    }
}