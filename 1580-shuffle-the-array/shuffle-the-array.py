class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        result = []
        left = 0
        right = n
        for i in range(int(len(nums)/2)):
            result.append(nums[i])
            result.append(nums[n+i])
        return result