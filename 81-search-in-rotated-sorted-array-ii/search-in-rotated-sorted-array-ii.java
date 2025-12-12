class Solution {
    public boolean search(int[] nums, int k) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == k) {
                return true;
            }
            
            // Handle duplicates - but check if we found target while shrinking
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                // Optional: Check edges before shrinking
                if (nums[low] == k) return true;
                low++;
                high--;
                continue;
            }
            
            // Left half sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= k && k < nums[mid]) {  // Use < instead of <=
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // Right half sorted
            else {
                if (nums[mid] < k && k <= nums[high]) {  // Use < instead of <=
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return false;
    }
}