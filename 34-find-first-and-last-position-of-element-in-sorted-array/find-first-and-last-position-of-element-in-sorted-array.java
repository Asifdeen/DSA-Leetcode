class Solution {
    public int getFirstOccurence(int [] nums, int n, int target) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(nums[mid]>=target) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid +1;
            }
        }
        if(ans == -1) {
            return ans;
        }
        if(nums[ans] != target || ans == n){
            return -1;
        }
        return ans;
    }

    public int getLastOccurence(int[] nums, int n, int target) {
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high) {
            int mid = (low+high)/2;

            if(nums[mid]>target) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans-1;
    }


    public int[] searchRange(int[] nums, int target) {
        int [] result = new int[] {-1,-1};
        int n = nums.length;
        if(n==0) {
            return result;
        }

        int firstOccurence = getFirstOccurence(nums,n,target);
        int lastOccurence = getLastOccurence(nums,n,target);
        if(firstOccurence == -1) {
            return new int[]{-1, -1};
        }
        return new int[] {firstOccurence,lastOccurence};
    }
}