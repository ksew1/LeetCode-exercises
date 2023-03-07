class Solution {
    public int maxArea(int[] height) {
        int result = -1;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
           result = Math.max(result, (end - start) * Math.min(height[start], height[end]));
           if (height[start] < height[end]) {
               start++;
           } else {
               end--;
           }
        }
        return result;
        
        
    }
}