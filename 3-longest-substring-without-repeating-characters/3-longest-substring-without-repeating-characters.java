class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = left;
        int result = 0;


        while(left < s.length()) {
            Character lChar = s.charAt(left);
            while (set.contains(lChar)) {
                Character rChar = s.charAt(right);
                set.remove(rChar);
                right++;
            } 
            set.add(lChar);
            left++;
            result = Math.max(result, left - right);
        } 
        return result;
        
    }
}