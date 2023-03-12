class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        c = 1
        last = nums[0]
        for i in range(1, len(nums)):
            if nums[i] > last:
                last = nums[i]
                nums[c] = last
                c += 1
        return c
            
        