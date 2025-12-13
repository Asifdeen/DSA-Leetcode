class Solution {
    public int sumByD(int [] nums, int mid) {
        int n = nums.length; 
        
        // Find the summation of division values
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+= Math.ceil((double) nums[i]/(double) mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
       int low = 1;
       int n = nums.length;
       

       if (n > threshold) return -1;

       int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int high = maxi;
       while(low<=high) {
        int mid = low + (high-low)/2;

        int sumByD = sumByD(nums, mid);

        if(sumByD <= threshold) {
            high = mid-1;
        } else{
            low = mid+1;
        }
       }
       return low;
    }
}