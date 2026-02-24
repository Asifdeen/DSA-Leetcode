class Solution {
    public boolean exist(char[][] board, String word) {
        //your code goes here

        int N = board.length;
        int M = board[0].length;

        for(int i = 0; i< N; i++) {
            for(int j= 0; j< M; j++) {
                if(helper(0, i, j, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(int index, int i, int j, char [][] board, String word) {
        int N = board.length;
        int M = board[0].length;
        if(index == word.length()) {
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }
        if((board[i][j] == '#') || (board[i][j] != word.charAt(index))) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found =
            helper(index+1, i-1, j, board, word) ||
            helper(index+1, i+1, j, board, word) ||
            helper(index+1, i, j-1, board, word) ||
            helper(index+1, i, j+1, board, word);

        board[i][j] = temp;

        return found;
    }
}