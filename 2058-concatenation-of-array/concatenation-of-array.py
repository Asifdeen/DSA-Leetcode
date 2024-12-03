class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = [0]*2*len(nums)
        l = 0
        r = len(nums)

        for num in nums:
            ans[l] = num
            ans[r] = num
            l+=1
            r+=1
        return ans