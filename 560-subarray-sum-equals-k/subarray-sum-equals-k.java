class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> hashmap = new HashMap<>();
        int currentPrefixSum = 0, subarrayCount = 0;
        hashmap.put(0,1);

        for (int i = 0; i < n; i++) {
        currentPrefixSum += nums[i];
        
        int target = currentPrefixSum - k;
        if (hashmap.containsKey(target)) {
            subarrayCount += hashmap.get(target);
        }
        hashmap.put(currentPrefixSum, hashmap.getOrDefault(currentPrefixSum, 0) + 1);
    }
        return subarrayCount;
    }
}