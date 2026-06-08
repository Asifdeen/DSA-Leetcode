class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low =0;
        int result = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for(int high=0; high<s.length() ;high++) {
            
            Character ch = s.charAt(high);
            freq.put(ch, freq.getOrDefault(ch,0)+1);

            //check validity
            while(freq.get(ch)>1) {
                freq.put(s.charAt(low), freq.get(s.charAt(low))-1);
                if(freq.get(s.charAt(low)) == 0) {
                    freq.remove(s.charAt(low));
                }
                low++;
            }
            result = Math.max(result, high-low+1);
                       
            
        }
        return result;
    }
}