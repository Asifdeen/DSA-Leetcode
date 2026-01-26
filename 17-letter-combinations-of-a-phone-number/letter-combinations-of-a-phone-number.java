class Solution {
    public List<String> letterCombinations(String digits) {
        //your code goes here
        List<String> result = new ArrayList<String>();
        String[] map = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(0,new StringBuilder(),digits,result, map);
        return result;

    }

    public void helper(int index, StringBuilder temp, String digits, List<String> result, String[] map) {
        if(index == digits.length()) {
            result.add(temp.toString());
            return;
        }

        String letters = map[digits.charAt(index)-'0'];

        for(char c: letters.toCharArray()) {
            temp.append(c);
            helper(index+1 , temp, digits, result, map);
             temp.deleteCharAt(temp.length() - 1);
        }
    }
}