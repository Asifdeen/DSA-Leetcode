class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int [] prefixSum = new int[nums.length+1];
        int result = 0;
        prefixSum[0] = 0;
        for(int i=1;i<nums.length+1;i++) {
            prefixSum[i] = prefixSum[i-1]+nums[i-1]; 
        }

        Map<Integer,Integer> subarrayMap = new HashMap<>();
        subarrayMap.put(0,1);
        for(int j=1;j<prefixSum.length;j++) {
            int rem = ((prefixSum[j] % k) + k) % k;
            if (subarrayMap.containsKey(rem)) {
                result+=subarrayMap.get(rem);
            } 
            subarrayMap.put(rem,subarrayMap.getOrDefault(rem, 0) + 1);
        }
        return result;
    }
}