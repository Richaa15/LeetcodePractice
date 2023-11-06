class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int candy: candies){
            max = Math.max(max, candy);
        }
        for(int candy : candies){
            list.add(candy + extra >= max);
        }
        return list;
    }
}