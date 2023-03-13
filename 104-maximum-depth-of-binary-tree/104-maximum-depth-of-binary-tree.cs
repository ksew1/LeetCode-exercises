/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int MaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        var result = 1;
        var stack = new Stack<(TreeNode, int)>();
        stack.Push((root, result));
        while (stack.Count > 0) {
            (var node, var depth) = stack.Pop();
            if (node != null) {
                result = Math.Max(result, depth);
                stack.Push((node.left, depth + 1));
                stack.Push((node.right, depth + 1));
            }
        }
        return result;
    }
    
}