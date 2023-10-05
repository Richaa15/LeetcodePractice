class Solution {
    public List<Integer> majorityElement(int[] arr) {
       int n = arr.length; //size of the array
        List<Integer> result = new ArrayList<>(); // list of answers

        //declaring a map:
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // least occurrence of the majority element:
        int minCount = (int)(n / 3) + 1;

        //storing the elements with their occurrence:
        for (int i = 0; i < n; i++) {
            int value = frequencyMap.getOrDefault(arr[i], 0);
            frequencyMap.put(arr[i], value + 1);

            //checking if arr[i] is
            // the majority element:
            if (frequencyMap.get(arr[i]) == minCount) {
                result.add(arr[i]);
            }
            if (result.size() == 2) break;
        }

        return result;
    }
}