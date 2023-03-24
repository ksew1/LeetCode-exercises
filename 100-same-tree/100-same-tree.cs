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
    public bool IsSameTree(TreeNode p, TreeNode q) {
        var stackP = new Stack<TreeNode>();
        var stackQ = new Stack<TreeNode>();
        stackP.Push(p);
        stackQ.Push(q);
        while (stackP.Count > 0 && stackQ.Count > 0) {
            var nodeP = stackP.Pop();
            var nodeQ = stackQ.Pop();
            if (nodeP == null && nodeQ == null) {
                continue;
            }
            if (nodeP == null || nodeQ == null) {
                return false;
            }
            if (nodeP.val != nodeQ.val) {
                return false;
            }
            stackP.Push(nodeP.left);
            stackP.Push(nodeP.right);
            stackQ.Push(nodeQ.left);
            stackQ.Push(nodeQ.right); 
        }
        return true;
        
    }
}