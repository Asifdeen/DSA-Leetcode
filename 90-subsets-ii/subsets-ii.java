class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //your code goes here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        helper(0, nums, result, new ArrayList<Integer>());
        return result;
    }

    public void helper(int index, int[] nums, List<List<Integer>> result, ArrayList<Integer> temp) {
        if(nums.length == index) {
            result.add(new ArrayList<>(temp));
            return;
        }

        //take
        temp.add(nums[index]);
        helper(index+1, nums, result, temp);
        // not take
        while(index+1 < nums.length && nums[index] == nums[index+1]) {
            index++;
        }
        temp.remove(temp.size()-1);
        helper(index+1, nums, result, temp);
    }
}