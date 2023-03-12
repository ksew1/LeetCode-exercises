class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s = strs[0]
        for i in range(len(s)):
            for j in range(1, len(strs)):
                if (i >= len(strs[j]) or strs[j][i] != s[i]):
                    return s[:i]
        return s