class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for(int i=0;i<n;i++) {
            temp.add(".".repeat(n));
        }
        helper(0, temp, result);
        return result;
    }

    public boolean isSafe(int row, int col, List<String> board ) {
        int r = row;
        int c = col;

        while(r>=0 && c>=0) {
            if(board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;

        while (r>=0 && c< board.size()) {
            if(board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r--;
            c++;
        }

        r = row;
        c = col;

        while (r>=0) {
            if(board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r--;
        }
        return true;
    }

    public void helper (int rowIndex, List<String> temp, List<List<String>> result) {
        if(rowIndex == temp.size()) {
            result.add(new ArrayList<>(temp));
            return;
        } else {
            for(int col =0; col< temp.get(0).length();col++) {
                if(isSafe(rowIndex, col, temp)) {
                    char[] rowArr = temp.get(rowIndex).toCharArray();
                    rowArr[col] = 'Q';
                    temp.set(rowIndex, new String(rowArr));
                    helper(rowIndex+1, temp, result);
                    rowArr[col] = '.';
                    temp.set(rowIndex, new String(rowArr));
                }
                
            }
        }
    }
}