class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if k>n:
            k = k % n
        for i in range(n//2):
            nums[i],nums[n-i-1] = nums[n-i-1],nums[i]

        for i in range(k//2):
            nums[i],nums[k-i-1] = nums[k-i-1],nums[i]
        print(nums)
        
        left = k
        right = n-1
        while left < right:
            nums[left],nums[right] = nums[right],nums[left]
            left+=1
            right-=1
        