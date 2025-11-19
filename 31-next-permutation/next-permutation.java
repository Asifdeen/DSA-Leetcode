class Solution {
    void reverseNums (int[] nums, int left){
            int right = nums.length-1;
            while (left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
    }
    public void nextPermutation(int[] nums) {
        // Your code goes here
        int index = -1;
        int n = nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]< nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverseNums(nums,0);
        } else {
            for(int i=n-1;i>index;i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            reverseNums(nums,index+1);
        }
    }
}