class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int result = 0;

        int[] alphabetCounts = new int[26];

        for(int high = 0; high < s.length(); high++) {
            Character ch = s.charAt(high);
            alphabetCounts[ch-'A']++;

            int length = high-low+1;
            int count = getCount(alphabetCounts);
            int difference = length - count;

            while(difference > k) {
                alphabetCounts[s.charAt(low)-'A']--;
                low++;
                length = high-low+1;
                count = getCount(alphabetCounts);
                difference = length - count;
                
            }
            result = Math.max(high-low+1, result);
        }
        return result;

    }

    public int getCount(int[] alphabet) {
        int max = 0;
        for(int num : alphabet) {
            max = Math.max(max, num);
        }
        return max;
    }
}