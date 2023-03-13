# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []
        if root != None:
            self.visit(root, 0 ,result)
        return result

    def visit(self, node, level, A):
        if node is None:
            return
        
        if not level < len(A):
            A.append([])
        A[level].append(node.val)
        
        self.visit(node.left, level + 1,A)
        self.visit(node.right, level + 1,A)