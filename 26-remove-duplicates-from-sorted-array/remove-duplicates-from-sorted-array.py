class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p1 = 0
        for i in range(1,len(nums)):
            if nums[i] != nums[p1]:
                nums[p1+1], nums[i] = nums[i],nums[p1+1]
                p1+=1
        return p1+1

            