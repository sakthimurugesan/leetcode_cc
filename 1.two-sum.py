#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l=[]
        for i in range(len(nums)):
            if target-nums[i] in l:
                return [i,l.index(target-nums[i])]

            l.append(nums[i])

    
        
# @lc code=end

