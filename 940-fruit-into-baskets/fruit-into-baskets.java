class Solution {
    public int totalFruit(int[] fruits) {
        int low =0;
        int result = 0;
        int k=2;

        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int high=0; high< fruits.length; high++) {
            freq.put(fruits[high] , freq.getOrDefault(fruits[high],0)+1);

            while(freq.size() > k) {
                freq.put(fruits[low], freq.get(fruits[low])-1);
                if(freq.get(fruits[low]) == 0) {
                    freq.remove(fruits[low]);
                }
                low++;
            }

                result = Math.max(result , high-low+1);
        }
        return result;
    }
}