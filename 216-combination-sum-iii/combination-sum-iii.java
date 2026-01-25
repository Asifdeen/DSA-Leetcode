class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        //your code goes here
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        helper(1, k, n, result, new ArrayList<Integer>());
        return result;
    }

    public void helper(int start, int k, int n, List<List<Integer>> result, ArrayList<Integer> temp) {
        if(temp.size() == k && n == 0) {
            result.add(new ArrayList<> (temp));
            return;
        }

        for(int i = start;i<=9;i++) {
            if(i>n) break;
            temp.add(i);
            helper(i+1, k, n-i, result, temp);
            temp.remove(temp.size()-1);
        }
    }
}