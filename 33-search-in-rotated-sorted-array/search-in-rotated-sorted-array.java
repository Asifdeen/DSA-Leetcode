class Solution {
    public int search(int[] nums, int k) {
       int low = 0;
       int n = nums.length;
       int high = n-1;

        while(low<=high) {
            int mid = (low+high)/2;
            if(nums[mid] == k) {
                return mid;
            }
            //left sorted
            if(nums[low] <= nums[mid]) {
                if(nums[low]<= k && k <= nums[mid]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            } else {
                if(nums[high] >= k && nums[mid]<= k) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }

        }
        return -1;
    }
}