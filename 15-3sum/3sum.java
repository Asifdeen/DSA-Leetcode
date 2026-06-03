class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List <List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i <n-2;i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i+1;
            int right = n-1;
            int s = -1 * nums[i];

            while(left < right) {
                int sum = nums[left] + nums[right];
                if(s == sum) {
                    List<Integer> innerList = new ArrayList<Integer>();
                    innerList.add(nums[i]);
                    innerList.add(nums[left]);
                    innerList.add(nums[right]);
                    result.add(innerList);
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while(left < right && nums[right]==nums[right+1]) {
                        right--;
                    }
                } else if(sum < s) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;
    }
}