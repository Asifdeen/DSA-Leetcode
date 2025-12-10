class Solution {
    public int maxFrequencyElements(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        int maxFrequency = 0;

        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num: nums){
            int f = frequencyMap.getOrDefault(num,0)+1;
            frequencyMap.put(num,f);
            if(maxFrequency < f) maxFrequency = f;
        }

        int ans =0;
        for(int freq : frequencyMap.values()){
            if(freq == maxFrequency) ans+=freq;
        }
        return ans;
    }
}