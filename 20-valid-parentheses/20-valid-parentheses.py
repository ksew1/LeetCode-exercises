class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c in ["(", "{", "["]:
                stack.append(c)
            else:
                if len(stack) == 0 or not self.check(c, stack.pop()):
                    return False
        if len(stack) != 0:
            return False
        return True
    def check(self, c, p):
        if p == "(" and c != ")":
            return False
        if p == "{" and c != "}":
            return False
        if p == "[" and c != "]":
            return False
        return True 