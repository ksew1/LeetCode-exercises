public class Solution {
    public int RemoveElement(int[] nums, int val) {
        var end = nums.Length - 1;
        var start = 0;
        while (start <= end) {
            while (start <= end && nums[start] == val) {
                nums[start] = nums[end];
                end -= 1;
            }
            start += 1;
        }
        return end + 1;
    }
}