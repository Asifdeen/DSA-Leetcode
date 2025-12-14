class Solution {
    public int getNumberofBouquets(int[]nums, int mid, int k) {
        int bouq = 0;
        int counter =0;

        for(int num: nums){
            if(mid >= num){
                counter++;
            } else {
                bouq+= (counter/k);
                counter =0;
            }
        }
        bouq+=(counter/k);
        return bouq;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int[] nums = bloomDay;
        int n = nums.length;
        if( n<m || n<k ||n < (long)(m*k)){
            return -1;
        }
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]<low){
                low = nums[i];
            }
            if(nums[i]>high) {
                high = nums[i];
            }
        }

        while(low <= high) {
            int mid = low + (high-low)/2;

            int bouquetsMade = getNumberofBouquets(nums,mid,k);

            if(bouquetsMade >= m) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}