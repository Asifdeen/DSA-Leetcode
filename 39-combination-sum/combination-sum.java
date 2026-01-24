class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>> result = new ArrayList<>();

        helper(0, candidates, target, new ArrayList<>(), result);
        
        return result;
    }

    public void helper(int index, int[] candidates, int target, List<Integer> temp, List<List<Integer>> result) {
        if(target ==0) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        if(index >= candidates.length || target < 0) {
            return;
        }

        //take
        temp.add(candidates[index]);
        helper(index, candidates, target-candidates[index], temp, result);
        //not take
        temp.remove(temp.size()-1);
        helper(index+1, candidates, target, temp, result);
        
    }
}