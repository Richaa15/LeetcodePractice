class Solution {
    public boolean winnerOfGame(String colors) {
        int aMoves=0,bMoves=0;
        int aCount=0,bCount=0;
        for(char c : colors.toCharArray()){
            if(c=='A'){
                bCount=0;
                aCount++;
                if(aCount>2){
                    aMoves++;
                }
            }
            else{
                aCount=0;
               bCount++;
                if(bCount>2){
                    bMoves++;
                }
            }
        }
        if(aMoves>bMoves)
            return true;
        else
        return false;
    }
}