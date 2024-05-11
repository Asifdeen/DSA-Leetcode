class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int result = 0;
        sort(nums.begin(),nums.end());
        if(nums[0]!=0){
            return 0;   
        }
        for(int i=0;i<nums.size()-1; i++){
            if(nums[i]+1 != nums[i+1]){
                result= nums[i]+1;
                break;
            }
        }
        return result != 0 ? result : nums[nums.size()-1]+1;
    }
};