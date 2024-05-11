class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count = 0;
        int maxCount = 0;
        for(auto num : nums){
            if(num != 0){
                count++;
            }
            else{
                if(maxCount < count){
                    maxCount = count;
                    count = 0;
                };
                count =0;
            }
        }
        return maxCount > count ? maxCount : count;
    }
};