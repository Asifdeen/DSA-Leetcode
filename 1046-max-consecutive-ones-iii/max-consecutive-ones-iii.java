class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int result = 0;
        int zeroCount = 0;

        for(int high =0; high < nums.length; high++) {
            
            if(nums[high] == 0) {
                zeroCount++;
            }

            int length = high-low+1;
            

            while(zeroCount > k) {

                
                if(nums[low] == 0) {
                    zeroCount--;
                }
                low++;
            }
            result = Math.max(result, high-low+1);
        }
        return result;
    }

    
}

