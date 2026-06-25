class Solution {
    public int maxSubArray(int[] nums) {
        int b = nums[0];
        int a = nums[0];

        if(nums.length == 1) {
            return nums[0];
        }


        for(int i=1;i<nums.length;i++) {
            int temp1 = nums[i];
            int temp2 = b + nums[i];

            b = Math.max(temp1 , temp2);
            a = Math.max(a,b);
        }
        return a;
    }
}