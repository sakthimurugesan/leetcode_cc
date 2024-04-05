/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    HashMap<Integer,Integer> mp=new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(this.mp.containsKey(target-nums[i]))
            {
                return new int[]{this.mp.get(target-nums[i]),i};
            }
            this.mp.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
// @lc code=end

