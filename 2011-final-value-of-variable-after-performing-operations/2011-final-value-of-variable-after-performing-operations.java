class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(int i=0; i<operations.length; i++)
        {
            String ops = operations[i];
            switch(ops)
            {
                case "++X":
                    ++X;
                    break;
                case "X++":
                    X++;
                    break;
                case "--X":
                    --X;
                    break;
                case "X--":
                    X--;
                    break;
            }
        }
        return X;
    }
}