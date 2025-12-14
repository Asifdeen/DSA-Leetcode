class Solution {
    public int sumOfhours(int [] nums, int mid) {
        int sum =0;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            sum+= Math.ceil((double) nums[i] / (double)mid);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int n = piles.length;
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max< piles[i]) {
                max = piles[i];
            }
        }

        int high = max;

        while (low <= high) {
            int mid = low + (high-low)/2;

            int sumOfhours = sumOfhours(piles,mid);

            if(sumOfhours <= h) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}