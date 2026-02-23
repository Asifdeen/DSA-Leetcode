class Solution {
    public List<List<String>> partition(String s) {
        //your code goes here
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(0, s, path, result);
        return result;
    }

    public void dfs(int index, String str, List<String> path, List<List<String>> result) {
        if(index == str.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i= index; i< str.length(); i++) {
            if(isPalindrome(str, index, i)) {
                path.add(str.substring(index, i+1));
                dfs(i+1, str, path, result);
                path.remove(path.size()-1);
            }

        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}