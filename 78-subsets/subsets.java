class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        helper(0,temp,nums, result);
        return result;
    }
    public void helper(int index, List<Integer> temp, int [] nums, List<List<Integer>> result) {
        if(index >= nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        helper(index+1,temp,nums, result);
        temp.remove(temp.size() - 1);
        helper(index+1,temp,nums, result);
    }
}