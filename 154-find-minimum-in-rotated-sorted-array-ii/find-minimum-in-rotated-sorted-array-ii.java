class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int n = nums.length;
        int high = n-1;
        int ans = Integer.MAX_VALUE;


        while (low <= high) {
            int mid = (low + high) /2;
            
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                if(ans > nums[low]) {
                    ans = nums[low];
                }
                low++;
                high--;
                continue;
            } else {
                if(nums[low] <= nums[mid]) {
                    if(ans > nums[low]) {
                        ans = nums[low];
                    }
                    low = mid+1;
                } else {
                    if(ans > nums[mid]) {
                        ans = nums[mid];
                    }
                    high = mid-1;
                }
            }
        }
        return ans;
    }
}